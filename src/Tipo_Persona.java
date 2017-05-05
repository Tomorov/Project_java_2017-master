/**
 * Created by Mario on 05/05/2017.
 */

/**
 * Classe astratta per gestire le persone in modo da avere metodi e campi comuni a tutte le classi.
 */
public abstract class Tipo_Persona  {

    //sicuramente ci saranno altri campi da aggiungere, per ora mi sono venuti in mente questi
    double time_to_live;
    boolean sposato;
    Tipo_Persona padre;
    Tipo_Persona madre;
    public ciclo ciclo_di_vita;

    /**
     * Un tipo enumerativo per gestire le fasi di vita.
     */
    public enum ciclo {
        INFANZIA,
        FERTILITA,
        ANZIANITA
    }

    /**
     * Il costruttore della classe. Per ora prende in imput solo padre e madre, ma ovviamente serviranno altri
     * parametri tipo un insieme con fratelli e sorelle.
     * @param padre
     * @param madre
     */
    public Tipo_Persona(Tipo_Persona padre, Tipo_Persona madre) {
        this.padre = padre;
        this.madre = madre;
        sposato = false;
        this.ciclo_di_vita = ciclo.INFANZIA;
    }

}

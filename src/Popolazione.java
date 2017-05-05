import java.util.*;

/**
 * Created by Roxas on 01/05/2017.
 */
public  class Popolazione  {

    public HashSet globale = new HashSet<>();             //erano private, le ho dovute rendere public per accederci tramite
    public HashSet morigerati = new HashSet<>();          // la classe stato
    public HashSet avventurieri = new HashSet<>();
    public HashSet prudenti = new HashSet<>();
    public HashSet spregiudicate = new HashSet<>();
    public static Stato percentuale;

 /* esempio */
    public Popolazione(int Nmori, int Navv, int Nprud, int Nspreg){
         for(int i=0; i<Nmori; i++){ morigerati.add(new Morigerati()); }
         for(int i=0; i<Navv; i++){ avventurieri.add(new Avventurieri()); }
         for(int i=0; i<Nprud; i++){ prudenti.add(new Prudenti()); }
         for(int i=0; i<Nspreg; i++){ spregiudicate.add(new Spregiudicate()); }
         globale.add(morigerati);
         globale.add(avventurieri);
         globale.add(prudenti);
         globale.add(spregiudicate);
         percentuale = new Stato(this);
         //RIUSCIRE A FARE UN ADDALL SENZA FARE 4 ADD?? BISOGNA CREARE UNA COLLECTION PERO CON SET.
    }



public static void main(String[] args){

    Popolazione globo= new Popolazione(15,5,12,43); //giocateci un po , starta la simulazione con quelle persone
    int poptotale=(globo.avventurieri.size()+globo.morigerati.size()+globo.spregiudicate.size()+globo.prudenti.size());
    System.out.println("La Popolazione globale è composta da: "+poptotale+" persone");
    System.out.println("La Popolazione dei morigerati è composta da: "+globo.morigerati.size()+" persone");
    System.out.println("La Popolazione degli avventurieri è composta da: "+globo.avventurieri.size()+" persone");
    System.out.println("La Popolazione dei prudenti è composta da: "+globo.prudenti.size()+" persone");
    System.out.println("La Popolazione degli spregiudicati è composta da: "+globo.spregiudicate.size()+" persone");
    System.out.println("\n\nGli stati delle popolazioni sono le seguenti: ");
    System.out.println("- Morigerati = "+percentuale.Smori+" %");
    System.out.println("- Avventurieri = "+percentuale.Savve+" %");
    System.out.println("- Prudenti = "+percentuale.Sprud+" %");
    System.out.println("- Spregiudicati = "+percentuale.Sspreg+" %");
}
}



/*Chiamiamo stato di una popolazione la percentuale del numero di individui
di ciascun tipo rispetto alla popolazione totale*/
class Stato{
    float Smori;
    float Savve;
    float Sprud;
    float Sspreg;
    public Stato(Popolazione globo){
        int poptotale=(globo.avventurieri.size()+globo.morigerati.size()+globo.spregiudicate.size()+globo.prudenti.size());
        Smori=(globo.morigerati.size()*100)/poptotale;
        Savve=(globo.avventurieri.size()*100)/poptotale;
        Sprud=(globo.prudenti.size()*100)/poptotale;
        Sspreg=(globo.spregiudicate.size()*100)/poptotale;
    }

}

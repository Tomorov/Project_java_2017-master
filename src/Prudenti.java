/**
 * Created by Roxas on 01/05/2017.
 */
public class Prudenti extends Thread {

    Thread p = new Thread(this, "Prudente");

    public Prudenti(){
        p.start();
    }
}

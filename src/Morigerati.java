/**
 * Created by Roxas on 01/05/2017.
 */
public class Morigerati extends Thread {
    Thread m = new Thread(this,"morigerato");

    public Morigerati(){
        m.start();
    }
}

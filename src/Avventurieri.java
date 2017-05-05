/**
 * Created by Roxas on 01/05/2017.
 */
public class Avventurieri extends Thread {
    Thread a = new Thread(this, "Avventuriero");

    public Avventurieri(){
        a.start();
    }
}

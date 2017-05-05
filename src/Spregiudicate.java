/**
 * Created by Roxas on 01/05/2017.
 */
public class Spregiudicate extends Thread {
    Thread s = new Thread(this, "Spregiudicata");

    public Spregiudicate() {
        s.start();
    }
}

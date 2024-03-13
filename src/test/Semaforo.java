package test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riost_fq9d95t
 */
public class Semaforo extends Thread {
    private Puente puente;
    
    public Semaforo() {
        this.puente = puente;
        start();
    }

    @Override
    public void run() {
        while (true) {            
            try {
                puente.senal();
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
}

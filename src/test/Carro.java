package test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riost_fq9d95t
 */
public class Carro extends Thread {
    private Puente puente;
    private boolean direccion;
    
    public Carro(Puente puente, boolean direccion) {
        this.puente = puente;
        this.direccion = direccion;
        start();
    }

    @Override
    public void run() {
        while (true) {            
            try {
                puente.cruzar(this.direccion);
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}

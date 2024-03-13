package test;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riost_fq9d95t
 */
public class Puente {

    private int cochesNorte;
    private int cochesSur;
    private boolean puenteVacio = true;
    private boolean direccion = true; // true: norte, false: sur

    public Puente() {
        this.cochesNorte = 0;
        this.cochesSur = 0;
        this.puenteVacio = true;
    }
    
    public synchronized void senal() {
        while (puenteVacio) {            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Puente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public synchronized void cruzar(boolean direccion) {
        while (this.direccion != direccion) {
            try {
                puenteVacio = false;
                this.direccion = direccion;
                System.out.println("Coche cruzando en dirección " + (direccion ? "norte" : "sur"));
                System.out.println("Cruzando");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Puente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        puenteVacio = true;
        notifyAll();
    }
}

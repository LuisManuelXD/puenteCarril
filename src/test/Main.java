package test;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import vista.ViewPuenteCarro;

/**
 *
 * @author riost_fq9d95t
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puente puente = new Puente();
        Carro carro1 = new Carro(puente, true);
        Carro carro2 = new Carro(puente, false);
        
        carro1.start();
        carro2.start();
//        JFrame ventana = new JFrame("Puente");
//        ViewPuenteCarro puenteCarro = new ViewPuenteCarro();
//
//        ventana.add(puenteCarro);
//        ventana.setSize(626, 500);
//        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ventana.setLocationRelativeTo(null);
//        ventana.setVisible(true);
//
//        while (true) {
//            try {
//                ventana.repaint();
//                Thread.sleep(10);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

}

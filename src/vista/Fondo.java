package vista;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author riost_fq9d95t
 */
public class Fondo {
    
    ViewPuenteCarro viewPuenteCarro;
    private Image fondoImage;
    
    private int anchoFondo = 626;
    private int altoFondo = 500;
    private int x1 = 1300;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;

    
    public Fondo(ViewPuenteCarro viewPuenteCarro) {
        this.viewPuenteCarro = viewPuenteCarro;
    }

    public void paint(Graphics2D g) {
        fondoImage = new ImageIcon(getClass().getResource("/img/fondo.jpg")).getImage();
        g.drawImage(fondoImage, x1, y1, anchoFondo, altoFondo, null);
        g.drawImage(fondoImage, x2, y2, anchoFondo, altoFondo, null);
    } 
}

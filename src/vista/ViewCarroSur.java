package vista;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author riost_fq9d95t
 */
public class ViewCarroSur {

    private ViewPuenteCarro viewPuenteCarro;

    private int anchoCarro = 120;
    private int largoCarro = 80;

    private int x_inicialSur = 600;
    private int y_inicialSur = 150;
    private boolean visible = true;

    public ViewCarroSur(ViewPuenteCarro viewPuenteCarro) {
        this.viewPuenteCarro = viewPuenteCarro;
    }

    public void paint(Graphics2D g) {
        if (visible) {
            ImageIcon carroSur = new ImageIcon(getClass().getResource("/img/carro-sur.png"));
            g.drawImage(carroSur.getImage(), x_inicialSur, y_inicialSur, anchoCarro, largoCarro, null);
        }
    }

    public void mover(boolean direccion) {
        if (x_inicialSur > -120) {
            x_inicialSur -= 2;
        } else {
            visible = false;
        }
    }
}

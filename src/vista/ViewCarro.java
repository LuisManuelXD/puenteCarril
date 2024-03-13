package vista;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author riost_fq9d95t
 */
public class ViewCarro {

    private ViewPuenteCarro viewPuenteCarro;

    private int anchoCarro = 120;
    private int largoCarro = 80;

    private int x_inicialNorte = -100;
    private int y_inicialNorte = 150;
    private int x_inicialSur = 600;
    private int y_inicialSur = 150;
    private boolean visible = true;

    public ViewCarro(ViewPuenteCarro viewPuenteCarro) {
        this.viewPuenteCarro = viewPuenteCarro;
    }

    public void paint(Graphics2D g, boolean direccion) {
        if (visible) {
            if (direccion) {
                ImageIcon carroNorte = new ImageIcon(getClass().getResource("/img/carro-norte.png"));
                g.drawImage(carroNorte.getImage(), x_inicialNorte, y_inicialNorte, anchoCarro, largoCarro, null);
            } else {
                ImageIcon carroSur = new ImageIcon(getClass().getResource("/img/carro-sur.png"));
                g.drawImage(carroSur.getImage(), x_inicialSur, y_inicialSur, anchoCarro, largoCarro, null);
            }
        }
    }

    public void mover(boolean direccion) {
        if (direccion) {
            if (x_inicialNorte < 610) {
                x_inicialNorte += 2;
            } else {
                visible = false;
            }
        } else {
            if (x_inicialSur > -120) {
                x_inicialSur -= 2;
            } else {
                visible = false;
            }
        }
    }
}

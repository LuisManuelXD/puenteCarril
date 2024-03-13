package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author riost_fq9d95t
 */
public class ViewPuenteCarro extends JPanel {

    Fondo fondo = new Fondo(this);
    ViewCarro viewCarro = new ViewCarro(this);

    private boolean direccion;

    private JButton btnNorte = new JButton("Mover al norte");
    private JButton btnSur = new JButton("Mover al sur");

    public ViewPuenteCarro() {
        add(btnNorte);
        add(btnSur);
        
        btnNorte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                direccion = true;
                mover();
            }
        });
        
        btnSur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                direccion = false;
                mover();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        dibujar(g2);
    }

    public void dibujar(Graphics2D g) {
        fondo.paint(g);
        viewCarro.paint(g, direccion);
        mover();
    }

    public void mover() {
        viewCarro.mover(direccion);
    }
}

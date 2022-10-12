

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class CAU3 extends JFrame {

    int x = 200;
    int y = 250;
    int c = 100;
    int d = 150;


    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.PINK);
        g.fillOval(x, y, 100, 100);
        g.setColor(Color.BLUE);
        g.fillOval(c, d, 100, 100);
    }
    public CAU3() {
        setTitle("HAI HÌNH TRÒN NÈ ");
        setSize(550,500);
        setLayout(null);
        setLocationRelativeTo(null);
        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                if(e.getKeyCode()==KeyEvent.VK_UP) {
                    y -= 10;
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    y += 10;
                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                    x -= 10;
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
                    x += 10;
                }
                repaint();


            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                if(e.getKeyCode()==KeyEvent.VK_W) {
                    d -= 10;
                }
                if(e.getKeyCode()==KeyEvent.VK_S) {
                    d += 10;
                }
                if(e.getKeyCode()==KeyEvent.VK_A) {
                    c -= 10;
                }
                if(e.getKeyCode()==KeyEvent.VK_D) {
                    c += 10;
                }
                repaint();


            }

        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CAU3 ht = new CAU3();
        ht.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ht.setVisible(true);

    }

}

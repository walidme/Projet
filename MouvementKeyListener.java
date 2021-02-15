// Le code est inspiré de :
// https://waytolearnx.com/2020/05/keylistener-java.html
// https://youtu.be/9sKY5_3HtUc
// https://waytolearnx.com/2020/05/comment-tracer-des-lignes-rectangles-et-cercles-dans-jframe.html
// Code réalisé par ROUX Amandine

import java.awt.*;
import java.awt.event.*;

public class MouvementKeyListener extends Frame implements KeyListener {

    int x, y, w, h;
    int pas = 10; // Le pas du personnage
    Graphics personnage;

    public MouvementKeyListener(int vx, int vy, int vw, int vh) {

        x = vx;
        y = vy;
        w = vw;
        h = vw;

        setSize(1000, 700);
        addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics personnage) {
        personnage.drawRect(x, y, w, h);
        personnage.setColor(Color.ORANGE);
        personnage.fillRect(x, y, w, h);
    }

    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y = y - pas;
                break;
            case KeyEvent.VK_DOWN:
                y = y + pas;
                break;
            case KeyEvent.VK_LEFT:
                x = x - pas;
                break;
            case KeyEvent.VK_RIGHT:
                x = x + pas;
                break;
        }
        repaint();
    }

    public void keyTyped(KeyEvent ke) {

    }

    public void keyReleased(KeyEvent ke) {

    }

    public static void main(String[] args) {
        int x = 500;
        int y = 500;
        int w = 50;
        int h = 50;
        new MouvementKeyListener(x, y, w, h).show();
    }

}
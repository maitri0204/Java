import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KeyAndMouseEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key and Mouse Event Example");
        frame.setSize(300, 200);

        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed: " + e.getKeyChar());
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked: " + e.getButton());
            }
        });

        frame.setVisible(true);
    }
}
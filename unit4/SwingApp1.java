/*First Swing GUI Application */

import javax.swing.*;
/*JFrame top level container */
class SwingApp1 extends JFrame{
    public SwingApp1(String title){
        super(title);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingApp1 s1 = new SwingApp1("WELCOME TO JAVA-GUI!!");
    }
}
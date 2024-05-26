import javax.swing.*;
class DisplayDetailsOfStudent{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information");

        JLabel name = new JLabel("Name");
        JLabel rollnoLabel = new JLabel("Roll no:");
        JLabel cpiLabel = new JLabel("CPI:");
        JLabel emailLabel = new JLabel("Email:");

        JTextField nameField = new JTextField(20);
        JTextField rollnoField = new JTextField(20);
        JTextField cpiField = new JTextField(20);
        JTextField emailField = new JTextField(20);

        JPanel panel = new JPanel();

        panel.add(name);
        panel.add(nameField);
        panel.add(rollnoLabel);        
        panel.add(rollnoField);
        panel.add(cpiLabel);        
        panel.add(cpiField);        
        panel.add(emailLabel);        
        panel.add(emailField);       

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

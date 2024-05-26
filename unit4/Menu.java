import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Menu extends JFrame{
	JMenu file = new JMenu("File");
	JMenu edit = new JMenu("Edit");
	JMenuBar menub = new JMenuBar();
	JMenuItem newf = new JMenuItem("New");
	JMenuItem openf = new JMenuItem("Open File");
	JMenuItem save = new JMenuItem("Save");
	JMenuItem saveas = new JMenuItem("Save as...");
	JMenuItem undo = new JMenuItem("Undo");
	JMenuItem redo = new JMenuItem("Redo");
	JMenuItem find = new JMenuItem("Find");
	JMenuItem replace = new JMenuItem("Replace");

	Menu(String title) {
		super(title);
		setSize(400, 400);
		file.add(newf);
		file.add(openf);
		file.add(save);
		file.add(saveas);
		edit.add(undo);
		edit.add(redo);
		edit.add(find);
		edit.add(replace);
		menub.add(file);
		menub.add(edit);
		setJMenuBar(menub);
		add(menub, BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Menu menu = new Menu("MENU");
	}

}

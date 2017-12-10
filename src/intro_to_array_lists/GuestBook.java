package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	String list = new String();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	ArrayList<String> names = new ArrayList();

	public GuestBook() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.setVisible(true);
		frame.pack();
		add.addActionListener(this);
		view.addActionListener(this);
	}

	public static void main(String[] args) {
		GuestBook hi = new GuestBook();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			String hi = JOptionPane.showInputDialog("Enter a name");
			names.add(hi);

		}
		if (e.getSource() == view) {
			for (int i = 0; i < names.size(); i++) {
				String hi = names.get(i);
				list = list + "\n" + hi;
			}
			JOptionPane.showMessageDialog(null, (list));
		}

	}

}

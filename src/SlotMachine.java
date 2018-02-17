import java.awt.Component;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel(); 
	JButton button = new JButton("Spin");
	JLabel pic1 = new JLabel(new ImageIcon("cherry.jpeg "));
	JLabel pic2 = new JLabel(new ImageIcon("lime.jpeg "));
	JLabel pic3 = new JLabel(new ImageIcon("orange.jpeg "));
	String p1pic;
	String p2pic;
	String p3pic;
public SlotMachine() {

	
	
	
}
public static void main(String[] args) {
	SlotMachine machine = new SlotMachine();
	Random rng = new Random();
	int  p1 = rng.nextInt(3) + 1;
	int  p2 = rng.nextInt(3) + 1;
	int  p3 = rng.nextInt(3) + 1;
	machine.setPic(p1);
    machine.setPic(p2);
	machine.setPic(p3);
	machine.panel.add(machine.button);
	machine.frame.add(machine.panel);
	machine.frame.pack();
	machine.frame.setVisible(true);
}
void setPic(int num) {
if (num == 1) {
	panel.add(pic1);
	}
	if (num == 2) {
		panel.add(pic2);
	}
	if (num == 2) {
		panel.add(pic3);
	}

}
}

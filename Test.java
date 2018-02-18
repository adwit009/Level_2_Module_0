import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test implements ActionListener {

	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField(10);
	JButton button1 = new JButton("Submit");
	JButton button2 = new JButton ("Hint");
	JLabel label = new JLabel("A pond has 10 fish. If 3 die, how many are left in the pond."); 
	String inputAnswer;
	String realAnswerNum ="10";
	String RealAnswerWord = "ten";
	public Test () {
		button1.addActionListener(this); 
		button2.addActionListener(this); 
		panel.add(label);
		panel.add(textfield);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		

	}
	public static void main(String[] args) {
	Test hi = new Test(); 
	 
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == button1) {
		  inputAnswer = textfield.getText();
		  if (inputAnswer.equals(realAnswerNum) || inputAnswer.equalsIgnoreCase(RealAnswerWord) ) {
			  JOptionPane.showMessageDialog(null, "correct");
			  textfield.setText("");
		}
		  else {
			  JOptionPane.showMessageDialog(null, "wrong");
	
		  textfield.setText("");
		  }
	
	
	} 	
		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "IN THE POND");
		}
		
		
		
	}
	
	
	
	
		
	}


import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.CORBA.IdentifierHelper;

public class TypingTutor implements KeyListener  {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
char currentLetter;
JLabel label = new JLabel();
   TypingTutor(){
	   currentLetter = generateRandomLetter();
	   addLetter();
	frame.add(panel);
	frame.setVisible(true);

	frame.addKeyListener(this);
	panel.add(label);
	
}
   public static void main(String[] args) {

TypingTutor t = new TypingTutor();   

	}





char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a'); 
	
}

void addLetter() {
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);	

	label.setText(currentLetter + "");
	label.setOpaque(true);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyChar() == currentLetter) {
		
		System.out.println("correct");
		label.setBackground(Color.GREEN);
	}
	else {
		System.out.println("wrong");
		label.setBackground(Color.RED);
	}


}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	currentLetter = generateRandomLetter();
	addLetter();
	panel.removeAll();
	panel.add(label);
	
}
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	Date timeAtEnd = new Date();
	long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	long gameInSeconds = (gameDuration / 1000) % 60;
	double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	int charactersPerMinute = (int) (charactersPerSecond * 60);
	JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}
Date timeAtStart = new Date();

}

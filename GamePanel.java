package LeaugeInvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Timestamp;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener,KeyListener {
Timer t;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
Font titleFont;
Font subFont;
//GameObject go;
GamePanel() { 
	t = new Timer(1000/60, this);
	titleFont = new Font("Arial",Font.PLAIN,48);
	subFont = new Font("Arial",Font.PLAIN,30);

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	if(currentState == MENU_STATE){

        updateMenuState();

}else if(currentState == GAME_STATE){

        updateGameState();

}else if(currentState == END_STATE){

        updateEndState();

}
	//go.update();
}
void startGame() {
t.start();

}
@Override

public void paintComponent(Graphics g){
//go.draw(g);                
	if(currentState == MENU_STATE){

        drawMenuState(g);

}else if(currentState == GAME_STATE){

        drawGameState(g);

}else if(currentState == END_STATE){

        drawEndState(g);

}
        }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hi");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		currentState += 1;
	}
	if (currentState > END_STATE) {
		currentState = MENU_STATE;
	}
	System.out.println("hi1");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hi2");
}
void updateMenuState () {
	   
}
void updateGameState () {
	
}
void updateEndState () {
	
}
void drawMenuState (Graphics g) {
	
	g.setColor(Color.BLUE);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	g.setColor(Color.RED);
    g.setFont(titleFont);
	g.drawString("League Invaders", 50, 200);
	g.setFont(subFont);
	g.drawString("Press ENTER to start", 105, 450);
	g.drawString("Press SPACE for instructions", 50, 550);
	
}
void drawGameState (Graphics g) {
	g.setColor(Color.BLACK);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
}
void drawEndState (Graphics g) {
	g.setColor(Color.RED);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	g.setColor(Color.BLACK);
    g.setFont(titleFont);
	g.drawString("GAME OVER", 85, 200);
	g.setFont(subFont);
	g.drawString("You killed" + "" + " enemies", 115, 400);
	g.drawString("Press ENTER to restart", 80, 550);
	
}

}
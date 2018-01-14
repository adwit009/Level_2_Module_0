package LeaugeInvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.Timestamp;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener,KeyListener {
	  public static BufferedImage alienImg;

      public static BufferedImage rocketImg;

      public static BufferedImage bulletImg;
      
      public static BufferedImage spaceImg;
	Timer t;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
boolean projectilefired = false;
int rocketwidth = 50;
int projectileWidth = 10;
Font titleFont;
Font subFont;
Rocketship rocket = new Rocketship(250,700 ,rocketwidth ,50 );
ObjectManager ObjMan = new ObjectManager(rocket);

GamePanel() { 
	t = new Timer(1000/60, this);
	titleFont = new Font("Arial",Font.PLAIN,48);
	subFont = new Font("Arial",Font.PLAIN,30);
	   try {

           alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));

           rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));

           bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
           
           spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));

   } catch (IOException e) {

           // TODO Auto-generated catch block

           e.printStackTrace();

   }




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
if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	rocket.left = true;
} 	
if (e.getKeyCode() == KeyEvent.VK_UP) {
	rocket.up = true;
} 	
if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	rocket.right = true;
} 	
if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	rocket.down = true;
} 
if (e.getKeyCode() == KeyEvent.VK_SPACE ) {
if (projectilefired == false) {
	
	ObjMan.addProjectile(new Projectile((rocket.x  +  rocketwidth/2 - projectileWidth/2), rocket.y, projectileWidth, 10));
projectilefired = true;
}
}
}


@Override
public void keyReleased(KeyEvent e) {
	if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		rocket.left = false;
	} 	
	if (e.getKeyCode() == KeyEvent.VK_UP) {
		rocket.up = false;
	} 	
	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		rocket.right = false;
	} 	
	if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		rocket.down = false;
	} 
	if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		projectilefired = false;
	} 

}
void updateMenuState () {
	
	ObjMan.reset();
  
}
void updateGameState () {
	ObjMan.update();
	ObjMan.manageEnemies();
	ObjMan.checkCollision();
	ObjMan.purgeObjects();
if (rocket.isAlive == false) {
	currentState = END_STATE;
	
	rocket = new Rocketship(250,700 ,rocketwidth ,50 );
ObjMan.addRocketship(rocket);
	
	
	
	
}


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
	g.drawImage(spaceImg,0,0,500,800,null);
	ObjMan.draw(g);


}
void drawEndState (Graphics g) {
	g.setColor(Color.RED);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	g.setColor(Color.BLACK);
    g.setFont(titleFont);
	g.drawString("GAME OVER", 85, 200);
	g.setFont(subFont);
	g.drawString("You killed " + ObjMan.getScore() + " enemies", 115, 400);
	g.drawString("Press ENTER to restart", 80, 550);
	
}

}

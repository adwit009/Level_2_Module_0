package LeaugeInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
int speed = 20;
	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	
	
	
	void update() {
		 super.update();
		y = y + speed;
		if (y>800 ) {
			isAlive = false;
		}
	}
	void draw (Graphics g) {
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}
	
}

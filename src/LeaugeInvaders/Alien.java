package LeaugeInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
int speed = 10;
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
	g.setColor(Color.YELLOW);	
	g.fillRect(x, y, width, height);
	}
	
}

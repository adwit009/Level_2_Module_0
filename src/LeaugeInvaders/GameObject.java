package LeaugeInvaders;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;

	int y;

	int width;

	int height;
	Rectangle collisionBox;
	boolean isAlive = true;
	GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		collisionBox = new Rectangle();
		collisionBox.setBounds(x,y,width,height);

	}
	

	void update() {
		collisionBox.setLocation(x, y);
	}

	void draw(Graphics g) {

	}

}

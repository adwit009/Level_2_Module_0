package LeaugeInvaders;

import java.awt.Graphics;

public class Projectile extends GameObject {
int speed = 10;
	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
@Override
	void update() {
		// TODO Auto-generated method stub
		y-= speed;
		if (y<0 ) {
			isAlive = false;
		}
	}
@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		super.draw(g);
	}
}

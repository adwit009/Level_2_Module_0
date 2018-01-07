package LeaugeInvaders;

import java.awt.Graphics;
import java.util.ArrayList;


public class ObjectManager {
Rocketship hi;
ArrayList<Projectile> projetiles = new ArrayList<>();
ObjectManager (Rocketship h) {
	hi = h;
}



void update () {
hi.update();


}
void draw (Graphics g){
	hi.draw(g);
}
void addProjectile (Projectile p) {
	projetiles.add(p);
}







}

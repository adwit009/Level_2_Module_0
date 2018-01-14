package LeaugeInvaders;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;


public class ObjectManager {
	long enemyTimer = 0;
	int score = 0;
Rocketship rocket;
ArrayList<Projectile> projectiles = new ArrayList<>();
ArrayList<Alien> aliens = new ArrayList<>();
ObjectManager (Rocketship h) {
	rocket = h;
}



void update () {
rocket.update();

for (int i = 0; i < projectiles.size(); i++) {
	Projectile p = projectiles.get(i);
p.update();

}
for (int i = 0; i < aliens.size(); i++) {
	Alien a = aliens.get(i);
a.update();

}
}
void draw (Graphics g){
	rocket.draw(g);
	for (int i = 0; i < projectiles.size(); i++) {
		Projectile p = projectiles.get(i);
	p.draw(g);

	}
	for (int i = 0; i < aliens.size(); i++) {
		Alien a = aliens.get(i);
	a.draw(g);

	}
}
void addProjectile (Projectile p) {
	projectiles.add(p);
}
void addAlien (Alien a) {
	aliens.add(a);
}
void manageEnemies() {
	int enemySpawnTime = 50;
	if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
          addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
  }
}
 void purgeObjects() {
	for (int i = 0; i < aliens.size(); i++) {
		
	if (aliens.get(i).isAlive == false) {
	aliens.remove(i);}
	
	}
	for (int i = 0; i < projectiles.size(); i++) {
		
	if (projectiles.get(i).isAlive == false) {
	projectiles.remove(i);}
	
	}	
 }
void checkCollision() {
	for(Alien a : aliens){

        if(rocket.collisionBox.intersects(a.collisionBox)){

                rocket.isAlive = false;

        }

}
for (int i = 0; i < aliens.size(); i++) {
	

	for (int v = 0; v < projectiles.size(); v++) {
	  Projectile p = projectiles.get(v);
	  Alien a = aliens.get(i);
	if(p.collisionBox.intersects(a.collisionBox)){
	
		
		aliens.get(i).isAlive = false;
         projectiles.get(v).isAlive = false;          
          score++;
 	


	}
	}

}




}
int getScore() {
	
	  return score;
	
}
void reset () {
	projectiles.clear();
	aliens.clear();
score = 0;
}
void addRocketship(Rocketship r) {
	rocket = r;
}




}






package LeaugeInvaders;

import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders {
	//https://league-level2.github.io/league_invaders_contents
	JFrame frame;
	static final int width = 500;
	 static final int height = 800;
	GamePanel gp;
	LeagueInvaders() {

		frame = new JFrame();
	frame.setSize(width, height);
		frame.setVisible(true);
		gp = new GamePanel();
	frame.addKeyListener(gp);
	}

	public static void main(String[] args) {
		LeagueInvaders runner = new LeagueInvaders();
		runner.setup();
	}

	void setup() {
frame.add(gp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		gp.startGame();
	}
  
}

package LeaugeInvaders;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int width = 500;
	final int height = 800;

	LeagueInvaders() {

		frame = new JFrame();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		LeagueInvaders runner = new LeagueInvaders();
		runner.setup();
	}

	void setup() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

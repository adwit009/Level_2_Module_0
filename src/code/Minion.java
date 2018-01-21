package code;

public class Minion {
	String name; 
	int eyes; 
	String color ; 
	 String master ;

	Minion (String name, int eyes, String color, String master) {
	
	this.eyes = eyes;
	this.name = name;
	this.color = color;
	this.master = master;
	
	
}
	
	
	String getColor() {
		String hi = color;
		return hi;
	}
	String getMaster() {
		String hi = master;
		return hi;
	}
	String getName() {
		String hi = name;
		return hi;
	}
	int getEyes() {
		int hi = eyes;
		return hi;
	}
	void setColor(String word) {
		color = word;
	
	}
	void setMaster(String word) {
		master = word;

	}
	void setName(String word) {
		name = word;

	}
	void setEyes(int num) {
		eyes = num;
	
	}


}

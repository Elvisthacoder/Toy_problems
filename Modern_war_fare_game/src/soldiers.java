
public class soldiers {
	private int lives;
	private int hitpoints;

	public soldiers(int lives, int hitpoints) {
		// TODO Auto-generated constructor stub
		this.lives=lives;
		this.hitpoints=hitpoints;	
	}
public int getlives(){
	return lives;
}
public void setlives(int lives){
	this.lives=lives;
}
public int hitpoints(){
	return lives;
}
public void hitpoints(int lives){
	this.lives=lives;
}
public int getHitpoints() {
	return hitpoints;
}
public void setHitpoints(int hitpoints) {
	this.hitpoints = hitpoints;
}
public int takeDamage(int damage){
	int remainingHitpoints = 0;
	//getHitpoints() sets access to private variable hitpoints
    remainingHitpoints = getHitpoints() - damage;
	
	return remainingHitpoints;
}

}



}

import java.util.*;
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soldier ghost = new soldier(3000);
		ghost.takeaDamage(500);
		SuperSoldier brad = new SuperSoldier(3,1000);
		System.out.println("Damage: "+brad.takeDamage(500));
	}

}





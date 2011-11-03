package Patches.Week1.Day1;

import Patches.Week1.Day1.VolcanoRobot;

class VolcanoApplication {
	public static void main(String[] arguments) {
		VolcanoRobot dante = new VolcanoRobot();
		dante.status = "Exploring..";
		dante.speed = 2;
		dante.temperature = 510;
                
                /* Excercise - Make a "virgil" robot.
                 * Seriously? It's just copy pasting...
                 * Seems like an IDE test and not a programming
                 * test.
                 * 
                 * -P
                 */
                VolcanoRobot virgil = new VolcanoRobot();
                // lolz, lets make it in space! I LOVE SPACE
                // SPACCEEEEE...SPAAAACEEEEEE
                virgil.status = "Orbiting..";
                virgil.speed = 0;
                virgil.temperature = -456;
		
                System.out.println("Checking status: VIRGIL\n------------");
                virgil.showAttributes();
                
                // Dante...
                System.out.println("Checking status: DANTE\n------------");
		dante.showAttributes();
		System.out.println("Increasing Speed to 3..");
		dante.speed = 3;
		dante.showAttributes();
		System.out.println("Changing Temperature to 670");
		dante.temperature = 670;
		dante.showAttributes();
		System.out.println("Checking the temperature...");
		dante.checkTemperature();
		dante.showAttributes();
	}
}
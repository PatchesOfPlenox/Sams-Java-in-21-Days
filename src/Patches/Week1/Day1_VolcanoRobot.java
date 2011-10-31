package Patches.Week1;
class VolcanoRobot {
	String status;
	int speed;
	float temperature;
	
	void checkTemperature() {
		if( temperature > 660 ) {
			status = "Returning home..";
			speed = 5;
		}
	}
	void showAttributes() {            
            System.out.println("\tStatus: " + status);
            System.out.println("\tSpeed: " + speed);
            System.out.println("\tTemperature: " + temperature);
            System.out.println("\n");
	}
}
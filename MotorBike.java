package firstjavaproject;

public class MotorBike {

private int speed;

 void setSpeed(int speed) {
	 System.out.println(speed);
	 System.out.println(this.speed);
	this.speed = speed;
}
public int getSpeed() {
return this.speed;
}
		void start() {
	    	 System.out.println("EngineStarted");
	     }
}



package firstjavaproject;

public class RunBike {

	public static void main(String[] args) {

		  MotorBike activa = new MotorBike();
		  MotorBike rayz = new MotorBike();
		  
		  activa.start();
		  rayz.start();
		  
		  activa.setSpeed(60);
		  //System.out.println(activa.getSpeed());
		  
		  rayz.setSpeed(50);
		 // System.out.println(rayz.getSpeed());
	}

}

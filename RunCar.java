package firstjavaproject;

public class RunCar {

	public static void main(String[] args) {
		CarSpeed alto = new CarSpeed();
		CarSpeed brezza = new CarSpeed();

		alto.start();
		brezza.start();
	

	alto.setSpeed(60);
	
	
	int altospeed=alto.getSpeed();
        altospeed=altospeed - 40;
        alto.setSpeed(altospeed);
        
        System.out.println(alto.getSpeed());
        //set alto to speed
	//inputs 
	//getspeed
	
	
	brezza.setSpeed(80);
	int brezzaspeed=brezza.getSpeed();
	brezzaspeed=brezzaspeed - 40;
	brezza.setSpeed(brezzaspeed);
	
	System.out.println(brezza.getSpeed());
   }

}
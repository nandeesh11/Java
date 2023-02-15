package firstjavaproject;

public class RunCopies {

	public static void main(String[] args) {
		Copies java2 = new Copies();
		Copies corePythonProgramming = new Copies();
		Copies adidev = new Copies();
		
		
		adidev.bookcopies();
	
		adidev.setCopies(3000);
		
		int adidevcopies=adidev.getCopies();
		adidevcopies=adidevcopies + 2000;
		adidev.setCopies(adidevcopies);
		
		System.out.println(adidev.getCopies());

	
	}
}

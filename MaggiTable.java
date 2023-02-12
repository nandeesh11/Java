package firstjavaproject;

public class MaggiTable {
	void print(int number, int from, int to) {
		for (int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d",number,i,number * i).println();
		}
	}

}

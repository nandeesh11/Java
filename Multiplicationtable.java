package firstjavaproject;

public class Multiplicationtable {
         
	void printtable () {
		for (int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d", 8,i,8 * i).println();
		}
	}
	void printtable (int table, int from, int to) {
		for (int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d", table,i,table * i).println();
		}
	}
}

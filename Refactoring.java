package firstjavaproject;

public class Refactoring {

	void print() {
		print();
	}
	
	void print (int table) {
		print(table,1,10);
	}
	void print(int table) {
		print(table);
	}
	
	void print(int table, int from, int to) {
		for (int i=1; i<=10; i++) {
			System.out.printf("%d * %d=%d", table, i, table * i).println();
		}
	}
}

package cycles;

// Найти сумму квадратов первых ста чисел.

public class TaskThree {
	double sum;
	double i;
		void outputOnDisplay() {
		for(i = 1; i <= 100; i++) {
		sum += Math.pow( i , 2 );
		System.out.println(" step:" + i +" | Summ =   " + sum);
		}
		}
	public static void main(String[] args) {
		TaskThree myTaskThree = new TaskThree();
		myTaskThree.outputOnDisplay();
	}

}

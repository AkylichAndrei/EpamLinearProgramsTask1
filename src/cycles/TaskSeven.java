package cycles;
import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.

public class TaskSeven {
	int m,n,number,i,j;
	
	void outputOnDisplay() {
		for( j = m ; j <= n ; j++ ) {
			System.out.println(" number  " + j + "  = ");
			number = j;
			for (i = 2; i <= number; i++) {
				if (number % i == 0) {
					System.out.print(i + "  ");
					number = number / i;
				}
			}
		System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		TaskSeven myTaskSeven = new TaskSeven();
		Scanner in = new Scanner(System.in);
		System.out.println("input number m: ");
		myTaskSeven.m = in.nextInt();
		System.out.println("input number n: ");
		myTaskSeven.n = in.nextInt();
		myTaskSeven.outputOnDisplay();   	 
		in.close();
	}
}

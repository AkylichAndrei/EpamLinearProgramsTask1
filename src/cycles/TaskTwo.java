package cycles;

import java.util.Scanner;

public class TaskTwo {
	int a , b , h , y , x;
	int i;
		
		void outputOnDisplay() {
			
		for( i = a ; i <= b ; i+=h ) {
			x = i;
			if( x > 2) { 
				y = Math.abs(x);
				System.out.println(" y = :  " + y );
				}
			if( x <= 2) {
				y = x * - 1;
				System.out.println(" y = :  " + y);
			}
			}
		}
	public static void main(String[] args) {
		TaskTwo myTaskTwo = new TaskTwo();
		System.out.println("Input a :  ");
		Scanner in = new Scanner(System.in);
	    myTaskTwo.a = in.nextInt();	 
	    System.out.println("Input b :  ");
	    myTaskTwo.b = in.nextInt();
	    System.out.println("Input h :  ");
	    myTaskTwo.h = in.nextInt();
	    myTaskTwo.outputOnDisplay();
	    in.close();

	}

}

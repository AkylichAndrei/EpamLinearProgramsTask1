package branching;

import java.util.Scanner;

public class TaskTwo {
	double a,b,c,d ;
	boolean bol;
		
		void outputOnDisplay() {
			System.out.println(" Result : " + Math.max( Math.min( a , b ) , Math.min( c , d ))); 
		
			}
	public static void main(String[] args) {
		
		TaskTwo myTaskTwo = new TaskTwo();
		System.out.println("Input a:  ");
		Scanner in = new Scanner(System.in);
	    myTaskTwo.a = in.nextDouble();	  
	    System.out.println("Input b:  ");
	    myTaskTwo.b = in.nextDouble();	
	    System.out.println("Input c:  ");
		myTaskTwo.c = in.nextDouble();	  
	    System.out.println("Input d:  ");
	    myTaskTwo.d = in.nextDouble();
	    myTaskTwo.outputOnDisplay();
	    in.close();
		
	}

}

package cycles;

import java.util.Scanner;


public class TaskOne {
	int x , sum;
	int i;
		
		void outputOnDisplay() {
			
		for( i = 0 ; i <= x ; i++ )
			sum += i;
		System.out.println("Result : "+ sum);
		}

	public static void main(String[] args) {
		
		TaskOne myTaskOne = new TaskOne();
		System.out.println("Input number :  ");
		Scanner in = new Scanner(System.in);
	    myTaskOne.x = in.nextInt();	  
	    myTaskOne.outputOnDisplay();
	    in.close();
	}

}

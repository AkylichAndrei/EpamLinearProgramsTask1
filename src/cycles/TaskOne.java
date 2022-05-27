package cycles;
import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число. 
// А программа суммирует все числа от 1 до введенного пользователем числа.

public class TaskOne {
	int x , sum, i;
	
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

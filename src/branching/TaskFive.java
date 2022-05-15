package branching;
import java.util.Scanner;
import static java.lang.Math.*;

public class TaskFive {
double x;
	void outputOnDisplay() {
		if( x <= 3 ) {
			x = pow( x , 2 ) - 3 * x + 9;
		}else {
			x = 1 / ( pow( x , 3 ) + 6 );
		}
		 System.out.println("Result : " + x);
		}
	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		System.out.println("Input x:  ");
		Scanner in = new Scanner(System.in);
	    myTaskFive.x = in.nextDouble();	  
	   	myTaskFive.outputOnDisplay();
	    in.close();
	}
}

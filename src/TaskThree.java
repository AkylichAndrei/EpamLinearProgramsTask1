import java.util.Scanner;
import static java.lang.Math.*;

public class TaskThree {
	double x, y, z;
	
	void calculate() {
		z = ((sin( x ) + cos( y )) / (cos( x ) - sin( y )) * tan(x * y));
		System.out.println(" z =" + z);
	}
	public static void main(String[] args) {
		System.out.println("Math example: z=((sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y)) ");
		TaskThree myTaskThree = new TaskThree();
		Scanner in = new Scanner(System.in);
	    System.out.print("Input x: ");
	    myTaskThree.x = in.nextDouble();	
	    System.out.print("Input y: ");
	    myTaskThree.y = in.nextDouble();
	    myTaskThree.calculate();
	    in.close();
	}
}
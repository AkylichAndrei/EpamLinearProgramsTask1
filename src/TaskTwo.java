import java.util.Scanner;
import static java.lang.Math.*;

public class TaskTwo {
	double a, b, c, z;
	void calculate() {
		z = ((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - pow(a,3) * c + pow(b,-2);
		System.out.println(" z =" + z);
	}
	public static void main(String[] args) {
		System.out.println("Math example: z=((b+sqrt(pow(b,2)+4*a*c))/2*a)-pow(a,3)*c+pow(b,-2) ");
		TaskTwo myTaskTwo = new TaskTwo();
		Scanner in = new Scanner(System.in);
	    System.out.print("Input a: ");
	    myTaskTwo.a = in.nextDouble();	
	    System.out.print("Input b: ");
	    myTaskTwo.b = in.nextDouble();
	    System.out.print("Input c: ");
	    myTaskTwo.c = in.nextDouble();
	    myTaskTwo.calculate();
	    in.close();
	}
}

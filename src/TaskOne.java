import java.util.Scanner;
//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
public class TaskOne {
	double a, b, c, z;
	
	void calculate() {
		z = ((a - 3) * b / 2) + c;
		System.out.println("((" + a + "-3)*" + b + "/2)+" + c + " =" + z);
	}
	
	public static void main(String[] args) {
		System.out.println("Math example: z=((a-3)*b/2)+c ");
		TaskOne theEquation = new TaskOne();
		Scanner in = new Scanner(System.in);
		System.out.print("Input value a: ");
		theEquation.a = in.nextDouble();	
		System.out.print("Input value b: ");
		theEquation.b = in.nextDouble();
		System.out.print("Input value c: ");
		theEquation.c = in.nextDouble();
		theEquation.calculate();
		in.close();
	}

}

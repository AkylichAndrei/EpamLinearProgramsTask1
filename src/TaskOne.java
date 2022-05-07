
import java.util.Scanner;

public class TaskOne {
	double a;
	double b;
	double c;
	double z;
	
	void calculate() {
		z = ((a - 3) * b / 2) + c;
		System.out.println("((" + a + "-3)*" + b + "/2)+" + c + " =" + z);
	}
	
	public static void main(String[] args) {
	System.out.println("Math example: z=((a-3)*b/2)+c ");
	TaskOne theEquation = new TaskOne();//создание обьекта theEquation(уравнение)
	Scanner in = new Scanner(System.in);
    System.out.print("Input value a: ");
    theEquation.a = in.nextDouble();	
    System.out.print("Input value b: ");
    theEquation.b = in.nextDouble();
    System.out.print("Input value c: ");
    theEquation.c = in.nextDouble();
    theEquation.calculate();//функция вычесления основного ровнения
	in.close();
	}

}

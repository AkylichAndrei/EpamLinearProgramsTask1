package branching;
import java.util.Scanner;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
// Определить, будут ли они расположены на одной прямой. 

public class TaskThree {
	int x1 , x2 , x3 , y1 , y2 , y3;
	void outputOnDisplay() {
		if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1)))
		{
			System.out.println("Result : true! ");
		}
		else System.out.println("Result : false! ");
		}
	
	public static void main(String[] args) {
			TaskThree myTaskThree = new TaskThree();
			System.out.println("Input x1:  ");
			Scanner in = new Scanner(System.in);
		    myTaskThree.x1 = in.nextInt();	  
		    System.out.println("Input y1:  ");
		    myTaskThree.y1 = in.nextInt();	
		    System.out.println("Input x2:  ");
			myTaskThree.x2 = in.nextInt();	  
		    System.out.println("Input y2:  ");
		    myTaskThree.y2 = in.nextInt();
		    System.out.println("Input x3:  ");
			myTaskThree.x3 = in.nextInt();	
			System.out.println("Input y3:  ");
			myTaskThree.y3 = in.nextInt();
		    myTaskThree.outputOnDisplay();
		    in.close();
	}
}
package branching;

import java.util.Scanner;

public class TaskOne {
	int x,y,z;
	boolean bol;	
		void outputOnDisplay() {
			
			bol = false;
			z = x + y;
			if ( z <= 179 )
				{
				bol = true;
				System.out.println("Treangle is real ");
				}
			else System.out.println("Treangle is not real ");
			if (( bol == true ) & (( x == 90 ) || ( y == 90 )))
			System.out.println("This triangle is rectangular  ");
			else System.out.println("This triangle is not rectangular  ");
		}

	public static void main(String[] args) {
				
		TaskOne myTaskOne = new TaskOne();
		System.out.println("Enter the angle of the triangle ¹1:  ");
		Scanner in = new Scanner(System.in);
	    myTaskOne.x = in.nextInt();	  
	    System.out.println("Enter the angle of the triangle ¹2:  ");
	    myTaskOne.y = in.nextInt();	
	    myTaskOne.outputOnDisplay();
	    in.close();
	}

}

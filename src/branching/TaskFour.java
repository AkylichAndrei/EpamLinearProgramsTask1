package branching;

import java.util.Scanner;

public class TaskFour {
int a , b , x , y , z;
	
	int[] intArray;
	void outputOnDisplay() {
		
		intArray = new int[3];
		intArray[ 0 ] = x;
		intArray[ 1 ] = y;
		intArray[ 2 ] = z;
		int mn;
		for(int i=0; i < 2 ; i++) 
			if(intArray[ i ] > intArray[ i+1 ]) {
				mn = intArray[ i ];
				intArray[ i ] = intArray[ i + 1 ];
				intArray[ i + 1 ] = mn;
			}
				
		if(( Math.min( a , b )) > ( Math.min( intArray[ 0 ] , intArray[ 1 ])) & 
				( Math.max( a , b)) > ( Math.max( intArray[ 0 ] , intArray[ 0 ] )))	{
			System.out.println("Result : true! ");
		}
		else System.out.println("Result : false! ");
	
		}
	public static void main(String[] args) {
		TaskFour myTaskFour = new TaskFour();
		System.out.println("Input A:  ");
		Scanner in = new Scanner(System.in);
	    myTaskFour.a = in.nextInt();	  
	    System.out.println("Input B:  ");
	    myTaskFour.b = in.nextInt();	
	    System.out.println("Input x:  ");
		myTaskFour.x = in.nextInt();	  
	    System.out.println("Input y:  ");
	    myTaskFour.y = in.nextInt();
	    System.out.println("Input z:  ");
		myTaskFour.z = in.nextInt();	  
	    myTaskFour.outputOnDisplay();
	    in.close();
		

	}

}

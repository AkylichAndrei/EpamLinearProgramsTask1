import java.util.Scanner;

public class TaskSix {
	
int x,y;
boolean bol;
	
	void outputOnDisplay() {
		
		bol=false;
		if (( y >= 1 ) & ( y <= 4 ) & ( x <= 1 ) & ( x >= -2 ))
			bol = true;
		if (( y >= 1 ) & ( y <= 4 ) & ( x >= 1 ) & ( x <= 2 ))
			bol = true;
		if (( y <= 0 ) & ( y >= -3 ) & ( x <= 0 ) & ( x >= -4 ))
			bol = true;
		if (( y <= 0 ) & ( y >= -3 ) & ( x >= 0 ) & ( x <= 4 ))
			bol = true;
		System.out.println(" Result : ");
		System.out.println(bol);
		}

	public static void main(String[] args) {
		
		
		TaskSix myTaskSix = new TaskSix();
		System.out.println("Input x:  ");
		Scanner in = new Scanner(System.in);
	    myTaskSix.x = in.nextInt();	  
	    System.out.println("Input y:  ");
	    myTaskSix.y = in.nextInt();	
	    myTaskSix.outputOnDisplay();
	    in.close();
	  

	}

}

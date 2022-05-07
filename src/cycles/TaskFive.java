package cycles;

import java.util.Scanner;

public class TaskFive {
	double n, i, y, sum, sum2, e;
	
	
	void outputOnDisplay() {
		i = 1; //по формуле начинаем с первого элемента
    while( i <= n ){
    	if((( Math.abs( 1 / Math.pow( 2 , i )) + ( 1 / Math.pow( 3 , i ))) >= e ))
        sum += (1/Math.pow(2 , i)) + (1/Math.pow(3 , i));
        i++;
    }
    System.out.println(" Result : " + sum);
	}
    
	public static void main(String[] args) {
		
		TaskFive myTaskFive = new TaskFive();
		System.out.println("Input n :  ");
		Scanner in = new Scanner(System.in);
	    myTaskFive.n = in.nextDouble();	 
	    System.out.println("Input e :  ");
		myTaskFive.e = in.nextDouble();	 
	    myTaskFive.outputOnDisplay();
	    in.close();
		
		
	}

}

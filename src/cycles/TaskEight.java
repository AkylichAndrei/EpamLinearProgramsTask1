package cycles;
import java.util.Scanner;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class TaskEight {
	String str1,str2,str3;
	char ch;
	int i,m,n,t;
	boolean flag;
	char[ ] chArray3 = new char[ 10 ];
	
	void outputOnDisplay() {
		str1 = Integer.toString ( m ); 
		char[ ] chArray1 = str1.toCharArray();
		str2 = Integer.toString ( n ); 
		char[ ] chArray2 = str2.toCharArray();
		t=0;
		for(int i = 0 ; i < chArray1.length ; i++){
		for(int j = 0 ; j < chArray2.length ; j++){
		  	if (chArray1[ i ] == chArray2[ j ]) {
		  	ch = chArray1[ i ];
		  	flag = false;
		  	for(int x=0; x < chArray3.length; x++)
		  	{
		  	if ( chArray3[ x ] == ch )
		  	flag = true;
		  	} 
		  	}  
		}
			if(flag==false) {
			chArray3[t]=ch;
			t++;
			flag=true;
			}
		}
		System.out.println(" Result : ");
		for(int x = 0 ; x < chArray3.length; x++)
		System.out.println(" " + chArray3[ x ]);
		}

	public static void main(String[] args) {
		TaskEight myTaskEight = new TaskEight();
		Scanner in = new Scanner(System.in);
		System.out.println("input number m: ");
		myTaskEight.m = in.nextInt();
		System.out.println("input number n: ");
		myTaskEight.n = in.nextInt();
		myTaskEight.outputOnDisplay();   	 
		in.close();
	}
}

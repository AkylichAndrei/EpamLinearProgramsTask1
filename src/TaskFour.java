import java.util.Scanner;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class TaskFour {
	String str;
	char ch;
	int i;
	void outputOnDisplay() {
		char[] chArray = str.toCharArray();
		for(int i = 0 ; i < 3 ; i++){
		ch = chArray[i]; 
		chArray[i] = chArray[i + 4];
		chArray[i + 4] = ch;
		}
		System.out.println(" Result : ");
		System.out.println(chArray);
		}
	public static void main(String[] args) {
		System.out.println("Enter view number R: nnn.ddd ");
		TaskFour myTaskFour = new TaskFour();
		Scanner in = new Scanner(System.in);
	    myTaskFour.str = in.nextLine();	  
	    myTaskFour.outputOnDisplay();
	    in.close();
	}
}

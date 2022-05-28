import java.util.Scanner;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.

public class TaskFive {
	int hour,min,sek;
	int t;
	int a,b,c;
	void calculate() {
		hour = t / 60 / 60;
		min = (t / 60) - (hour * 60);
		sek = t - (hour * 60 * 60) - (min * 60);
		System.out.println(" Result : "+hour +" Hour | " + min + " Minutes |" + sek +  " Seconds " );
	}
	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		Scanner in = new Scanner(System.in);
		System.out.print("Input T: ");
		myTaskFive.t = in.nextInt();
		myTaskFive.calculate();
		in.close();
	}

}

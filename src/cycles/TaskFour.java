package cycles;

public class TaskFour {
	double sum;
	double i;
		
		void outputOnDisplay() {
			sum = 1;
		for(i = 1; i <= 200; i++)
			{sum = sum * Math.pow( i , 2 );
		System.out.println(" step:" + i +" | Summ =   " + sum);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskFour myTaskFour = new TaskFour();
		 myTaskFour.outputOnDisplay();
	}

}

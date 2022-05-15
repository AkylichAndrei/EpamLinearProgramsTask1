package cycles;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class TaskSix {
		int dec;
		String oct;
		int i;
		void outputOnDisplay() {
			for( i = 50; i < 56; i++ ) {
			String oct = "0"+Integer.toString (i);
			dec = Integer.parseInt( oct, 8 );
			System.out.println( " Число " + oct );
			System.out.println(" В десятичной с.с. будет " + dec);
			System.out.println(" Знак ASCII будет " + (char) dec);
			}
		}
	public static void main(String[] args) {
		TaskSix myTaskSix = new TaskSix();
		myTaskSix.outputOnDisplay();
	}
}

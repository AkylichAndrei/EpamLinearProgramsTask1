package cycles;


public class TaskSix {

		
		int dec;
		String oct;
		int i;
		void outputOnDisplay() {
			
			for( i = 50; i < 56; i++ ) {
			String oct = "0"+Integer.toString (i);
			dec = Integer.parseInt( oct, 8 );
			System.out.println( "����� " + oct );
			System.out.println("� ���������� �.�. ����� " + dec);
			System.out.println("���� ASCII ����� " + (char) dec);
			}
		}
	
	public static void main(String[] args) {
		TaskSix myTaskSix = new TaskSix();
		myTaskSix.outputOnDisplay();
	    
		
	}

}

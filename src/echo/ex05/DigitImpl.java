package echo.ex05;

public class DigitImpl implements Runnable{

	@Override
	public void run() {
		
		
		for(int i = 0; i <=9; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	
	
}

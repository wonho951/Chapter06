package echo.ex03;

public class UpperThread extends Thread{

	
	@Override
	public void run() {
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}

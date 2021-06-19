package echo.ex04;

public class DigitRunableImpl implements Runnable{

	@Override
	public void run() {
		
		
		for(int i = 0; i <=9; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);//딜레이 시간을 늘림
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	
	
}

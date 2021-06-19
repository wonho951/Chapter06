package echo.ex03;

public class DigitThread extends Thread{

	@Override
	public void run() {
		
		
		for(int i = 0; i <=9; i++) {
			System.out.println(i);
			
			try {	//강제적으로 딜레이 타임을 늘렸기때문에 트라이캐치로 예외 잡아줌.
				Thread.sleep(500);//딜레이 시간을 늘림
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	}
	
	
	
	

}

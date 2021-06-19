package echo.ex03;

public class LowerThread extends Thread{

	@Override
	public void run() {
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);//딜레이 시간을 늘림
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}

	
	
	
}

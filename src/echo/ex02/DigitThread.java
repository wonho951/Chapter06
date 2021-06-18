package echo.ex02;

public class DigitThread extends Thread{	//	Thread는 만들어져 있응께 사용하면 됨.

	@Override
	public void run() {	//부모(object)한테 있는 메소드
		
		//0~9까지 출력하는거 만듦
		for (int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		
		
		
	}	


	
	
	
	
}

package echo.ex02;

public class DigitThread extends Thread{	//	Thread는 만들어져 있응께 사용하면 됨.

	
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드-일반
	
	@Override
	public void run() {	//부모(object)한테 있는 메소드
				//run 메소드 이름 바꾸면 안된다.
				//우리 로직 코드는 반드시 run()에 작성해야함.
		//0~9까지 출력하는거 만듦
		for (int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		
		
		
	}	


	
	
	
	
}

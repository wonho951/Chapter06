package echo.ex02;

public class MultithreadApp {

	public static void main(String[] args) {
		
		
		Thread thread = new DigitThread();	//섞어쓰기
		thread.start();	//	start()는 내부적으로 run()을 호출하게 되어있음.
						//	start() 내부에 출장준비(이동,자리세팅) --> 내부에서run()실행
		
		for (char ch = 'A'; ch <= 'Z'; ch++ ) {
			System.out.println(ch);
		}
		

	}

}

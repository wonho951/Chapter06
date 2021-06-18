package echo.ex03;

public class Multithread {

	public static void main(String[] args) {
		
		//원래 메인에서는 시간순이지만 --> 각자 독립적으로 일하게 만듦.(멀티스레드)
		
        Thread thread1 = new DigitThread();
        Thread thread2 = new LowerThread();
        Thread thread3 = new UpperThread();
         
        thread1.start();
        thread2.start();
        thread3.start();

		
		
	}

}

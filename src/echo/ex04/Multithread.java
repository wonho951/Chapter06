package echo.ex04;

public class Multithread {

	public static void main(String[] args) throws Exception{
		
		//DigitRunableImpl digit = new DigitRunableImpl();	정석은 메모리에 올리고
		//Thread thread = new Thread(digit);	일케 주면되는데
		
		Thread thread = new Thread(new DigitRunableImpl());	//걍 한번에 올릴수 있음.ㅇㅋ?
		thread.start();//시작하는거 

		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			
			System.out.println(ch);
			
			Thread.sleep(500);//딜레이 시간을 늘림
		}
	}

}

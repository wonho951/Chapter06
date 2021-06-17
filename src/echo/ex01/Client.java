package echo.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException{

		//다른 컴퓨터에서 작동할 애 --> 유저
		
		Socket socket = new Socket();	//서버소켓 말고 유저쪽은 소켓임.
		socket.bind(new InetSocketAddress("192.168.0.133", 10001));
		
		
		
	}

}

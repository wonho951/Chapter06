package echo.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		// 소켓 프로그래밍
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("183.96.42.64", 10001));
		//포트는 항구라고 생각.
		
		System.out.println("<서버시작>");
		System.out.println("==============================");
		System.out.println("연결을 기다리고 있습니다.");
		
		
		Socket socket = serverSocket.accept();
		//클라이언트 누군가 오면 어쎕트()안에 new socket이 만들어져서 socket에 담긴다.
		
		
		System.out.println("클라이언트가 연결 되었습니다.");
		
		
		//메세지 받기용
		InputStream is = socket.getInputStream();	// 주스트림--> 걍 달라고함.(처음 빨대 꽂고)
		InputStreamReader isr = new InputStreamReader(is);	//중간빨대랑 처음 빨대 연결해줌.
		BufferedReader br = new BufferedReader(isr);	//제일 큰 빨대에 연결해서 공차 먹듯이ㅇㅇ
		
		
		
		
		
		
		
		
		
		socket.close();
		serverSocket.close();// 얘도 닫아줘야함.
		
		
		
		

		/*
		 * ServerSocket serverSocket = new ServerSocket(); serverSocket.(new
		 * InetSocketAddress("192.168.0.133", 10001)); // IP 포트번호
		 * 
		 * System.out.println("<서버시작>");
		 * System.out.println("================================");
		 * System.out.println("[연결을 기다리고 있습니다.]");
		 * 
		 * Socket socket = serverSocket.accept(); // 클라이언트 누군가 오면 어쎕트()안에 new socket이
		 * 만들어져서 socket에 담긴다.
		 * 
		 * System.out.println("클라이언트가 연결 되었습니다.");
		 * 
		 * 
		 * socket.close();
		 * serverSocket.close();//얘도 닫아줘야함.
		 */
	}

}

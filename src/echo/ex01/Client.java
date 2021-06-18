package echo.ex01;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException{

		//다른 컴퓨터에서 작동할 애 --> 유저
		Socket socket = new Socket();	//서버소켓 말고 유저쪽은 소켓임.
		
		System.out.println("<클라이언트 시작>");
		System.out.println("===================================");
		
		
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("183.96.42.64", 10001));
		System.out.println("[서버에 연결되었습니다.]");
		
		
		//메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();	//아웃풋 조상이 같음.
		// 기존 아웃풋 스트림 사용법
		//OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String str = "안녕";
		
		bw.write(str);
		
		socket.close();
	}

}

package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException{

		//다른 컴퓨터에서 작동할 애 --> 유저
		Socket socket = new Socket();	//서버소켓 말고 유저쪽은 소켓임.
		
		System.out.println("<클라이언트 시작>");
		System.out.println("===================================");
		
		
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("183.96.42.64", 10001));
		System.out.println("[서버에 연결되었습니다.]");
		
		
		//메세지 보내기용 스트림	(클라이언트에서 서버로 보냄)
		OutputStream os = socket.getOutputStream();	//아웃풋 조상이 같음.
		// 기존 아웃풋 스트림 사용법
		//OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
	

		//보내는 메세지 키보드 입력으로 바꿈
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
				
		bw.write(str);
		bw.newLine();
		bw.flush();
		
		
		//메세지 받기용 스트림	(서버에서 클라이언트로 받음)
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String reMsg = br.readLine();
		
		System.out.println("server: [" + reMsg + "]");
		
		
		sc.close();
		socket.close();
	}

}

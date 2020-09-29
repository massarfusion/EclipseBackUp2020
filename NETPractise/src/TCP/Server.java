package TCP;
import java.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(8001);
		Socket s=ss.accept();
		System.out.println("信道搭建完毕");
		InputStream ips=s.getInputStream();
		OutputStream ops=s.getOutputStream();
		//客户端的输入流就是服务端输出流，客户端的输出流就是服务端的输入流
		
		ops.write("Server in Service".getBytes());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(ips));
		System.out.println("Client msg sent:"+br.readLine());
		
		ips.close();
		ops.close();
		s.close();
		ss.close();
	}

}

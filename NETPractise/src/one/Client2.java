package one;

import java.io.IOException;
import java.net.*;

public class Client2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket();
		String str="Viva !";
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),
				InetAddress.getByName("127.114.114.19"),1919);
		
		System.out.println("二号待命中");
		ds.send(dp);
		System.out.println("二号传输终了");
		//Sending procedure end now;
		//Time for receiving procedure
		Thread.sleep(900);
		byte [] buf=new byte[1024];
		DatagramPacket dp2=new DatagramPacket(buf,1024);
		System.out.println("二号待命中");
		ds.receive(dp2);
		System.out.println("二号接受终了,接受内容放送：");
		String src=new String ( dp2.getData(),0,dp2.getLength()  )+" FROM ";
	}

}

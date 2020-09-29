package one;
import java.io.IOException;
import java.net.*;
public class Client1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket(1919);//端口在1919
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf,1024);
		
		System.out.println("一号待命中");
		ds.receive(dp);
		System.out.println("一号接受终了,接受内容放送：");
		String rec=new String(dp.getData(),0,dp.getLength())+
				" FROM "+dp.getAddress()+":"+dp.getPort();
		System.out.print(rec);
		
		
		
		
		
	}

}

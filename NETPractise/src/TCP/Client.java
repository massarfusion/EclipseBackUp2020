package TCP;
import java.net.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket sc=new Socket(InetAddress.getByName("127.0.0.1"),8001);
		InputStream ips=sc.getInputStream();
		BufferedReader brNet=new BufferedReader(new InputStreamReader(ips));
		
		OutputStream ops=sc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(ops);
		
		BufferedReader brKBD=new BufferedReader(new InputStreamReader(System.in));
		
		while (true)
		{
			String strWord=brKBD.readLine();
			if (strWord.equalsIgnoreCase("QUIT")) {
				break;
			}
			else {
				System.out.println("I wanna to send "+strWord);
				dos.writeBytes(strWord+System.getProperty("line.separator"));
				
				System.out.println("Server said:"+brNet.readLine());
				
				
			}
			
			
		}
		
		
		
		
	}

}

package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLGetTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			String urlname="http://www.baidu.com";
			URL url=new URL(urlname);
			URLConnection connection =url.openConnection();
			connection.connect();
			
			Map<String,List<String>> headers=connection.getHeaderFields();
			for (Map.Entry<String, List<String>> entry:headers.entrySet())
			{
				String key=entry.getKey();
				for (String value:entry.getValue()) {
					System.out.println(key+":"+value);
				}
			}
			
			BufferedReader br=new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
			String line="";
			while((line=br.readLine())!=null) 
			{
				System.out.println(line);
			}
			br.close();
		
	}

}

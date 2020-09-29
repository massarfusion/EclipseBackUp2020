package work01;

import java.io.UnsupportedEncodingException;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    System.out.println("🐎".getBytes("UTF-8").length);
		    System.out.println("👴‍".getBytes("UTF-8").length);
		} catch (UnsupportedEncodingException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	}

}

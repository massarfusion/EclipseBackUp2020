package hello;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testfield {

	public static void main(String[] args) {
		try {
            //������com.mysql.jdbc.Driver
            //���� mysql-connector-java-5.0.8-bin.jar��
            //��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");
              
            System.out.println("���ݿ��������سɹ� ��");
   
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
	
}

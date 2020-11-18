package une;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File i=new File("D:\\PIN.txt");
		System.out.println(
				"绝对路径"+" "+i.getAbsolutePath()+"\n"+
				"存在吗？"+" "+i.exists()+"\n"+
				"是不是文件夹"+" "+i.isDirectory()+"\n"+
				"长度"+" "+i.length()+"\n"
				
		);
		try(FileInputStream fis=new FileInputStream(i)) {
			
			byte[] all=new byte[(int)i.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.print(b);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		try(FileReader fr=new FileReader(i)) {
			char[] all=new char[(int)i.length()];
			fr.read(all);
			for (char c : all) {
				System.out.print(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		try(FileWriter fwr=new FileWriter(i)) {
//			String append="This is a test.";
//			fwr.write(append.toCharArray());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
	}

}

import java.io.*;

public class TxtFileWrite {
	public static void main(String[] args) {
		writeFile1();
		System.out.println("===================");
		writeFile2(); // JDK 7�����ϲſ���ʹ��
	}

	public static void writeFile1() {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream("c:/temp/abc.txt"); // �ڵ���
			osw = new OutputStreamWriter(fos, "UTF-8"); // ת����
			//osw = new OutputStreamWriter(fos); // ת����
			bw = new BufferedWriter(osw); // װ����
			// br = new BufferedWriter(new OutputStreamWriter(new
			// FileOutputStream("c:/temp/abc.txt")))
			bw.write("������");
			bw.newLine();
			bw.write("Ecnuers.^^");
			bw.newLine();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				bw.close(); // �ر����һ���࣬�Ὣ���еĵײ������ر�
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void writeFile2() {
		//try-resource ��䣬�Զ��ر���Դ
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/abc.txt")))) {
			bw.write("������");
			bw.newLine();
			bw.write("Ecnuers.^^");
			bw.newLine();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

package work01;
import java.math.BigDecimal;
//这是一个OJ专用的空白代码样板
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
    System.out.println('a'+3);
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int offset=in.nextInt();
    char [] result=new char[str.length()];
//    System.out.println("-"+str+"-");
    for (int i=0;i<str.length();i++) {
    	char sep=str.charAt(i);
    	if (sep==' ') {result[i]=' ';}
    	else if(((int)sep+offset)>122&&(sep>'a'&&sep<'z')) {
    		result[i]=(char)(97+(offset-(int)('z'-sep)-1));
    	}
    	else if( ((int)sep+offset)>90&&(sep>'A'&&sep<'Z')) {
    		result[i]=(char)(65+(offset-(int)('Z'-sep)-1));
    	}
    	else {
    		result[i]=(char)(sep+offset);
    	}
    }
    String fin=new String (result);
    System.out.println(fin);
    ///////////////////////////边界线////////////////////////////////
   }//main函数入口
}//Main类


	


package grammar;
import java.io.IOException;
import java.util.List;
import java.util.Stack;

import scanning.*;
public class Grammer {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ScannerTkn scn=new ScannerTkn();
		List<Token> tokens=scn.listTkn();
		List<Token> symbols=scn.listSym();
		Stack<String> processStack=new Stack<String>();
		Stack<String> readStack=new Stack<String>();
		readStack.push("#");
		processStack.push("#");
		processStack.push("L");
		for (int i=tokens.size();i>0;i--) {
			readStack.push(tokens.get(i).getCode());
		}
	}
	public String[] getSeq(String waiting,String coming) {
		//L
		if ("L".equals(waiting)&&"18".equals(coming)){return new String[]{"S","Z"};}
		else if ("L".equals(waiting)&&"8".equals(coming)){return new String[]{"S","Z"};}
		else if ("L".equals(waiting)&&"17".equals(coming)){return new String[]{"S","Z"};}
		else if ("L".equals(waiting)&&"2".equals(coming)){return new String[]{"S","Z"};}
		else if ("L".equals(waiting)&&"16".equals(coming)){return new String[]{"S","Z"};}
		else if ("L".equals(waiting)&&"#".equals(coming)){return new String[]{""};}
		else if ("L".equals(waiting)&&"6".equals(coming)){return new String[]{""};}
		//Z
		else if ("Z".equals(waiting)&&"30".equals(coming)){return new String[]{"30","L"};}
		else if ("Z".equals(waiting)&&"6".equals(coming)){return new String[]{""};}
		else if ("Z".equals(waiting)&&"#".equals(coming)){return new String[]{""};}
		//S
		else if ("S".equals(waiting)&&"30".equals(coming)){return new String[]{""};}
		else if ("S".equals(waiting)&&"18".equals(coming)){return new String[]{"18","31","E"};}
		else if ("S".equals(waiting)&&"8".equals(coming)){return new String[]{"8","B","14","S","Q"};}
		else if ("S".equals(waiting)&&"5".equals(coming)){return new String[]{""};}
		else if ("S".equals(waiting)&&"17".equals(coming)){return new String[]{"17","B","4","S"};}
		else if ("S".equals(waiting)&&"2".equals(coming)){return new String[]{"2","L","6"};}
		else if ("S".equals(waiting)&&"16".equals(coming)){return new String[]{"16","D"};}
		//E
		else if ("E".equals(waiting)&&"18".equals(coming)){return new String[]{"T","H"};}
		else if ("E".equals(waiting)&&"23".equals(coming)){return new String[]{"23","T","H"};}
		else if ("E".equals(waiting)&&"24".equals(coming)){return new String[]{"24","T","H"};}
		else if ("E".equals(waiting)&&"19".equals(coming)||"E".equals(waiting)&&"20".equals(coming))
		{return new String[]{"T","H"};}
		else if ("E".equals(waiting)&&"21".equals(coming)){return new String[]{"T","H"};}
		//H
		else if ("H".equals(waiting)&&"30".equals(coming)){return new String[]{""};}
		else if ("H".equals(waiting)&&"23".equals(coming)){return new String[]{"M","H"};}
		else if ("H".equals(waiting)&&"24".equals(coming)){return new String[]{"M","H"};}
		else if ("H".equals(waiting)&&"22".equals(coming)){return new String[]{""};}
		else if ("H".equals(waiting)&&"5".equals(coming)){return new String[]{""};}
		//M
		else if ("M".equals(waiting)&&"23".equals(coming)){return new String[]{"23","T"};}
		else if ("M".equals(waiting)&&"24".equals(coming)){return new String[]{"24","T"};}
		//T
		else if ("T".equals(waiting)&&"18".equals(coming)){return new String[]{"F","W"};}
		else if ("T".equals(waiting)&&"19".equals(coming)||"T".equals(waiting)&&"20".equals(coming))
		{return new String[]{"F","W"};}
		else if ("T".equals(waiting)&&"21".equals(coming)){return new String[]{"F","W"};}
		//W
		else if ("W".equals(waiting)&&"30".equals(coming)){return new String[]{""};}
		else if ("W".equals(waiting)&&"23".equals(coming)){return new String[]{""};}
		else if ("W".equals(waiting)&&"24".equals(coming)){return new String[]{""};}
		else if ("W".equals(waiting)&&"25".equals(coming)){return new String[]{"N","W"};}
		else if ("W".equals(waiting)&&"26".equals(coming)){return new String[]{"N","W"};}
		else if ("W".equals(waiting)&&"22".equals(coming)){return new String[]{""};}
		else if ("W".equals(waiting)&&"5".equals(coming)){return new String[]{""};}
		//N
		else if ("N".equals(waiting)&&"25".equals(coming)){return new String[]{"25","F"};}
		else if ("N".equals(waiting)&&"26".equals(coming)){return new String[]{"26","F"};}
		//F
		else if ("F".equals(waiting)&&"18".equals(coming)){return new String[]{"18"};}
		else if ("F".equals(waiting)&&"19".equals(coming)||"F".equals(waiting)&&"20".equals(coming))
		{return new String[]{"20"};}
		else if ("F".equals(waiting)&&"21".equals(coming)){return new String[]{"21","E","22"};}
		//Q
		else if ("Q".equals(waiting)&&"30".equals(coming)){return new String[]{""};}
		else if ("Q".equals(waiting)&&"5".equals(coming)){return new String[]{"5","S"};}
		//D
		else if ("D".equals(waiting)&&"18".equals(coming)){return new String[]{"A","29","K","30","R"};}
		//R
		else if ("R".equals(waiting)&&"30".equals(coming)){return new String[]{""};}
		else if ("R".equals(waiting)&&"18".equals(coming)){return new String[]{"D"};}
		else if ("R".equals(waiting)&&"5".equals(coming)){return new String[]{""};}
		//A
		else if ("A".equals(waiting)&&"18".equals(coming)){return new String[]{"18","X"};}
		//X
		else if ("X".equals(waiting)&&"29".equals(coming)){return new String[]{""};}
		else if ("X".equals(waiting)&&"28".equals(coming)){return new String[]{"28","A"};}
		//K
		else if ("K".equals(waiting)&&"9".equals(coming)){return new String[]{"9"};}
		else if ("K".equals(waiting)&&"3".equals(coming)){return new String[]{"3"};}
		else if ("K".equals(waiting)&&"13".equals(coming)){return new String[]{"13"};}
		//#
		else if ("#".equals(waiting)&&"#".equals(coming)){return new String[]{""};}
		//ELSE
		else {System.out.println("Error");
				return new String[] {"ERROR"};
		}
		}//METHOD
	public int priority(String a,String b) {
	    if("21".equals(a)&&( "11".equals(b)||"1".equals(b)||"10".equals(b)||
	            "15".equals(b)||"7".equals(b)||"21".equals(b)||
	            "33".equals(b)||"37".equals(b)||"34".equals(b)||
	            "36".equals(b)||"38".equals(b)||"35".equals(b)||"23".equals(b)||
	            "24".equals(b)||"25".equals(b)||"26".equals(b)||
	            "18".equals(b)||"19".equals(b))||"20".equals(b) ) 
	    {return 1;}
	    else if ( ("22".equals(b)||"11".equals(b)) 
	            && ( "11".equals(a)||"1".equals(a)||"10".equals(a)||
	                    "18".equals(a)||"15".equals(a)||"7".equals(a)||
	                    "22".equals(a)||"23".equals(a)||"24".equals(a)||
	                    "25".equals(a)||"26".equals(a)||"34".equals(a)||
	                    "36".equals(a)||"33".equals(a)||"37".equals(a)||
	                    "38".equals(a)||"35".equals(a)||"19".equals(a)||
	                    "20".equals(a)) ) 
	    {return 3;}
	    else if ("11".equals(a)&&( "1".equals(b)||"10".equals(b)||"18".equals(b)||
                "15".equals(b)||"7".equals(b)||"21".equals(b)||
                "34".equals(b)||"36".equals(b)||"33".equals(b)||
                "37".equals(b)||"38".equals(b)||"35".equals(b)||"23".equals(b)||
                "24".equals(b)||"25".equals(b)||"26".equals(b)||
                "19".equals(b))||"20".equals(b)) 
	    {return 1;}
	    else if ( ("1".equals(b)) 
                && ( "1".equals(a)||"10".equals(a)||
                        "18".equals(a)||"15".equals(a)||"7".equals(a)||
                        "22".equals(a)||"23".equals(a)||"24".equals(a)||
                        "25".equals(a)||"26".equals(a)||"34".equals(a)||
                        "36".equals(a)||"33".equals(a)||"37".equals(a)||
                        "38".equals(a)||"35".equals(a)||"19".equals(a)||
                        "20".equals(a)) ) 
        {return 3;}
	    else if (("1".equals(a)||"10".equals(a))&&
	            ("10".equals(b)||"18".equals(b)||
                "15".equals(b)||"7".equals(b)||"21".equals(b)||
                "34".equals(b)||"36".equals(b)||"33".equals(b)||
                "37".equals(b)||"38".equals(b)||"35".equals(b)||"23".equals(b)||
                "24".equals(b)||"25".equals(b)||"26".equals(b)||
                "19".equals(b))||"20".equals(b)  ) 
        {return 1;}
	    else if ( ("22".equals(a)||"23".equals(a)||"25".equals(a)
	            ||"26".equals(a)||"18".equals(a)||"19".equals(a)) 
	            ||"20".equals(a)||"22".equals(a)
                && ( "11".equals(b)||"1".equals(b)||"10".equals(b)||
                        "18".equals(b)||"15".equals(b)||"7".equals(b)
                         ) )
        {return 3;}
	    else if ( ("34".equals(a)||"36".equals(a)||"33".equals(a)
                ||"37".equals(a)||"38".equals(a)||"35".equals(a)) 
                && ( "23".equals(b)||"24".equals(b)||"25".equals(b)||
                        "26".equals(b)||"18".equals(b)||"19".equals(b)
                        ||"20".equals(b)||"21".equals(b)
                         ) )
        {return 1;}
	    else if ( ("23".equals(a)||"24".equals(a)) 
                && ( 
                        "25".equals(b)||"26".equals(b)||
                        "20".equals(b)||"18".equals(b)||"19".equals(b)
                        ||"21".equals(b)
                   ) 
                )
        {return 1;}
	    else if ( ("25".equals(a)||"26".equals(a)) 
                && ( 
                        "18".equals(b)||"19".equals(b)||
                        "20".equals(b)||"21".equals(b)
                   ) 
                )
        {return 1;}
	    else if ( 
	                "21".equals(a)&&"22".equals(b)
                )
        {return 2;}
	    else {
            return 114514;
        }
	  //1< 2= 3>
    }//priority
	}//CLASS

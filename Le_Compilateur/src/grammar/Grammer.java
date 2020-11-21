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
		}
	
	}

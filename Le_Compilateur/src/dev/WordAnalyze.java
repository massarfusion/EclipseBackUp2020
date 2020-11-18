package dev;
import java.io.File;
import java.io.FileReader;
public class WordAnalyze {
    String keyWord[] = {"program","var","if","then","begin","end","else","and","while","not","integer"
    		,"bool","real","true","false","const","type","function","procedure"};
    char ch;
    //判断是否是关键字
    boolean isKey(String str)
    {
        for(int i = 0;i < keyWord.length;i++)
        {
            if(keyWord[i].equals(str))
                return true;
        }
        return false;
    }
    //判断是否是字母
    boolean isLetter(char letter)
    {
        if((letter >= 'a' && letter <= 'z')||(letter >= 'A' && letter <= 'Z'))
            return true;
        else
            return false;
    }
    //判断是否是数字
    boolean isDigit(char digit)
    {
        if(digit >= '0' && digit <= '9')
            return true;
        else
            return false;
    }
    //词法分析
    void analyze(char[] chars)
    {
        String arr = "";
        for(int i = 0;i< chars.length;i++) {
            ch = chars[i];
            arr = "";
            if(ch == ' '||ch == '\t'||ch == '\n'||ch == '\r'){continue;}
            else if(isLetter(ch)){
                while(isLetter(ch)||isDigit(ch)){    
                    arr += ch;
                    i++;
                    ch = chars[i];
                }
                //最后一个字符输入会导致i移到词语后方，而后面判断完成之后
                i--;
                if(isKey(arr)){
                    //关键字
                    System.out.println(arr+"\t4"+"\t关键字");
                }
                else{
                    //标识符
                    System.out.println(arr+"\t4"+"\t标识符");
                }
            }
            else if(isDigit(ch)||(ch == '.'))
            {
                while(isDigit(ch)||(ch == '.'&&isDigit(chars[++i])))
                {
                    if(ch == '.') i--;
                    arr = arr + ch;
                    ch = chars[++i];
                }
                //属于无符号常数
                System.out.println(arr+"\t5"+"\t常数");
            }
            else switch(ch){
                //运算符
                case '+':System.out.println(ch+"\t2"+"\t运算符");break;
                case '-':System.out.println(ch+"\t2"+"\t运算符");break;
                case '*':System.out.println(ch+"\t2"+"\t运算符");break;
                case '/':System.out.println(ch+"\t2"+"\t运算符");break;
                //分界符
                case '(':System.out.println(ch+"\t3"+"\t分界符");break;
                case ')':System.out.println(ch+"\t3"+"\t分界符");break;
                case '[':System.out.println(ch+"\t3"+"\t分界符");break;
                case ']':System.out.println(ch+"\t3"+"\t分界符");break; 
                case ';':System.out.println(ch+"\t3"+"\t分界符");break;
                case '{':System.out.println(ch+"\t3"+"\t分界符");break;
                case '}':System.out.println(ch+"\t3"+"\t分界符");break;
                //特殊运算符
                case '=':{
                            ch = chars[++i];
                            if(ch == '=')System.out.println("=="+"\t2"+"\t运算符");
                            else {
                                System.out.println("="+"\t2"+"\t运算符");
                                i--;
                            }
                         }break;
                case ':':{
                            ch = chars[++i];
                            if(ch == '=')System.out.println(":="+"\t2"+"\t运算符");
                            else {
                                System.out.println(":"+"\t2"+"\t运算符");
                                i--;
                            }
                         }break;
                case '>':{
                            ch = chars[++i];
                            if(ch == '=')System.out.println(">="+"\t2"+"\t运算符");
                            else {
                                System.out.println(">"+"\t2"+"\t运算符");
                                i--;
                            }
                         }break;
                case '<':{
                            ch = chars[++i];
                            if(ch == '=')System.out.println("<="+"\t2"+"\t运算符");
                            else {
                                System.out.println("<"+"\t2"+"\t运算符");
                                i--;
                            }
                         }break;
                //兜底
                default: System.out.println(ch+"\t6"+"\t未能识别");
            }//for
        }//method
        int a=0;
    }//class
public static void main(String[] args) throws Exception {
    File file = new File("D:\\data.txt");//定义一个file对象，用来初始化FileReader
    FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
    int length = (int) file.length();
    char buf[] = new char[length+1];
    //防止多读取一个导致NULLPOINTER
    reader.read(buf);
    reader.close();
    new WordAnalyze().analyze(buf);
    //2运算符 3分界符号 4关键字或者标识符 5常数 6其他未能识别的
}
}
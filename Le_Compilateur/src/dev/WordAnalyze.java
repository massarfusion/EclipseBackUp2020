package dev;
import java.io.File;
import java.io.FileReader;
public class WordAnalyze {
    String keyWord[] = {"program","var","if","then","begin","end","else","and","while","not","integer"
    		,"bool","real","true","false","const","type","function","procedure"};
    char ch;
    //�ж��Ƿ��ǹؼ���
    boolean isKey(String str)
    {
        for(int i = 0;i < keyWord.length;i++)
        {
            if(keyWord[i].equals(str))
                return true;
        }
        return false;
    }
    //�ж��Ƿ�����ĸ
    boolean isLetter(char letter)
    {
        if((letter >= 'a' && letter <= 'z')||(letter >= 'A' && letter <= 'Z'))
            return true;
        else
            return false;
    }
    //�ж��Ƿ�������
    boolean isDigit(char digit)
    {
        if(digit >= '0' && digit <= '9')
            return true;
        else
            return false;
    }
    //�ʷ�����
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
                //���һ���ַ�����ᵼ��i�Ƶ�����󷽣��������ж����֮��
                i--;
                if(isKey(arr)){
                    //�ؼ���
                    System.out.println(arr+"\t4"+"\t�ؼ���");
                }
                else{
                    //��ʶ��
                    System.out.println(arr+"\t4"+"\t��ʶ��");
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
                //�����޷��ų���
                System.out.println(arr+"\t5"+"\t����");
            }
            else switch(ch){
                //�����
                case '+':System.out.println(ch+"\t2"+"\t�����");break;
                case '-':System.out.println(ch+"\t2"+"\t�����");break;
                case '*':System.out.println(ch+"\t2"+"\t�����");break;
                case '/':System.out.println(ch+"\t2"+"\t�����");break;
                //�ֽ��
                case '(':System.out.println(ch+"\t3"+"\t�ֽ��");break;
                case ')':System.out.println(ch+"\t3"+"\t�ֽ��");break;
                case '[':System.out.println(ch+"\t3"+"\t�ֽ��");break;
                case ']':System.out.println(ch+"\t3"+"\t�ֽ��");break; 
                case ';':System.out.println(ch+"\t3"+"\t�ֽ��");break;
                case '{':System.out.println(ch+"\t3"+"\t�ֽ��");break;
                case '}':System.out.println(ch+"\t3"+"\t�ֽ��");break;
                //���������
                case '=':{
                            ch = chars[++i];
                            if(ch == '=')System.out.println("=="+"\t2"+"\t�����");
                            else {
                                System.out.println("="+"\t2"+"\t�����");
                                i--;
                            }
                         }break;
                case ':':{
                            ch = chars[++i];
                            if(ch == '=')System.out.println(":="+"\t2"+"\t�����");
                            else {
                                System.out.println(":"+"\t2"+"\t�����");
                                i--;
                            }
                         }break;
                case '>':{
                            ch = chars[++i];
                            if(ch == '=')System.out.println(">="+"\t2"+"\t�����");
                            else {
                                System.out.println(">"+"\t2"+"\t�����");
                                i--;
                            }
                         }break;
                case '<':{
                            ch = chars[++i];
                            if(ch == '=')System.out.println("<="+"\t2"+"\t�����");
                            else {
                                System.out.println("<"+"\t2"+"\t�����");
                                i--;
                            }
                         }break;
                //����
                default: System.out.println(ch+"\t6"+"\tδ��ʶ��");
            }//for
        }//method
        int a=0;
    }//class
public static void main(String[] args) throws Exception {
    File file = new File("D:\\data.txt");//����һ��file����������ʼ��FileReader
    FileReader reader = new FileReader(file);//����һ��fileReader����������ʼ��BufferedReader
    int length = (int) file.length();
    char buf[] = new char[length+1];
    //��ֹ���ȡһ������NULLPOINTER
    reader.read(buf);
    reader.close();
    new WordAnalyze().analyze(buf);
    //2����� 3�ֽ���� 4�ؼ��ֻ��߱�ʶ�� 5���� 6����δ��ʶ���
}
}
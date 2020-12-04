package darwin;

import java.util.ArrayList;
import java.util.List;

public class Chromosome {
    public int score;
    public boolean [] gene;
    public Chromosome(int size) {
        if (size <= 0) {
            return;
        }
        initGeneSize(size);
        for (int i = 0; i < size; i++) {
            gene[i] = Math.random() >= 0.5;
        }
    }//给予初值
     
    public Chromosome() {
        // TODO Auto-generated constructor stub
    }
    public Chromosome(String input) {
        if (input==null) {
            ;
        }
        else {
            initGeneSize(input.length());
            for (int i=0;i<gene.length;i++) {
                boolean sign;
                if (input.charAt(i)=='0') {sign=false;}
                else if (input.charAt(i)=='1') {sign=true;}
                else {
                    sign=true;
                }
                gene[i]=sign;
            }
        }
    }

    private void initGeneSize(int size) {
        if (size <= 0) {
            return;
        }
        gene = new boolean[size];
    }//给予初始长度
    public int getNum() {
        if (gene == null) {
            return 0;
        }
        int num = 1;
        int sum=0;
        for (int i=gene.length-1;i>=0;i--) {
            sum+=num*(gene[i]?1:0);
            num<<=1;
        }
        return sum;
    }//二进制转十进制
    public void mutation(int num) {
        //允许变异
        int size = gene.length;
        for (int i = 0; i < num; i++) {
            //寻找变异位置
            int at = ((int) (Math.random() * size)) % size;
            //变异后的值
            boolean bool = !gene[at];
            gene[at] = bool;
        }
    }//异变
    public static Chromosome clone(Chromosome c) {
        if (c == null || c.gene == null) {
            return null;
        }
        Chromosome copy = new Chromosome();
        copy.initGeneSize(c.gene.length);
        for (int i = 0; i < c.gene.length; i++) {
            copy.gene[i] = c.gene[i];
        }
        return copy;
    }//复制
    public static List<Chromosome> breed(Chromosome c1,Chromosome c2){
        if (c1==null||c2==null) {
            return null;
        }
        else if (c1.gene==null||c2.gene==null) {
            return null;
        }
        else if (c1.gene.length!=c2.gene.length) {
            return null;
        }
        else {;}
        int size=c1.gene.length;
        Chromosome p1=Chromosome.clone(c1);
        Chromosome p2=Chromosome.clone(c2);
        int a=((int)(Math.random()*size))%size;
        int b=((int)(Math.random()*size))%size;
        int start=a>b?b:a;
        int end=a>b?a:b;
        for (int i=start;i<=end;i++) {
            boolean tmp=p1.gene[i];
            p1.gene[i]=p2.gene[i];
            p2.gene[i]=tmp;
        }
        List<Chromosome> result=new ArrayList<Chromosome>();
        result.add(p1);
        result.add(p2);
        return result;
    }//繁衍（交叉）
    
}

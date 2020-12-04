package darwin;

import java.util.ArrayList;
import java.util.List;

public class WildPlace {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Chromosome> items=new ArrayList<Chromosome>();
        items.add(new Chromosome("1100"));
        items.add(new Chromosome("0111"));
        items.add(new Chromosome("0001"));
        items.add(new Chromosome("1110"));
        items.add(new Chromosome("0100"));
        items.add(new Chromosome("1001"));
        for (Chromosome ctmp:items) {
            updateScore(ctmp);
        }
        for (int i=0;i<7;i++) {
            Chromosome p1=WheelSpin(items);
            Chromosome p2=WheelSpin(items);
            while(p1==p2) {
              p1=WheelSpin(items);
              p2=WheelSpin(items);
            }
            items.addAll(Chromosome.breed(p1, p2));
            for (Chromosome ctmp:items) {
                updateScore(ctmp);
            }
        }
//        int a=0;
        int max=-114;
        Chromosome choice=null;
        for (Chromosome cmp:items) {
            if (cmp.score>max) {
                max=cmp.score;
                choice=cmp;
            }
        }
        int a=0;
    }
    public static void updateScore(Chromosome target) {
        int tmp=target.getNum();
        target.score=tmp*(15-tmp);
    }
    public static Chromosome WheelSpin(List<Chromosome> chrLst) {
        int total=0;
        for (Chromosome r:chrLst) {
            total+=r.score;
        }
        int slice=(int)(total*Math.random());
        int sum=0;
        for (Chromosome chr:chrLst) {
            sum+=chr.score;
            if (sum>=slice) {
                return chr;
            }else {;}
        }
        return chrLst.get(chrLst.size()-1);
    }
    
}

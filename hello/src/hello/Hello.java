package hello;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Hello {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // ����
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // �����ǰ���ִ���0��������֮��һ������0�����Խ���ѭ��
            if(i > 0 && nums[i] == nums[i-1]) continue; // ȥ��
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // ȥ��
                    while (L<R && nums[R] == nums[R-1]) R--; // ȥ��
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }        
        return ans;
    }
    
    ////////////////////////////////////////////
    
    
    public List<String> letterCombinations(String digits) {
        ArrayList<String> res=new ArrayList<String>();
        if (digits.length()<1){return res;}//ɾ�������
        ArrayList<char[]> mirror=new ArrayList<char[]>();//���ֵ�char[]��ӳ��
        mirror.add("***".toCharArray());mirror.add("***".toCharArray());
        mirror.add("abc".toCharArray());mirror.add("def".toCharArray());
        mirror.add("ghi".toCharArray());mirror.add("jkl".toCharArray());
        mirror.add("mno".toCharArray());mirror.add("pqrs".toCharArray());
        mirror.add("tuv".toCharArray());mirror.add("wxyz".toCharArray());
        char[] tempNums=digits.toCharArray();
        int [] numSeq=new int [tempNums.length];//����[2,5,9,.....]
        for (int i=0;i<tempNums.length;i++){
            numSeq[i]=(int)(tempNums[i]-'0');
        }
        for (int index=0;index<numSeq.length;index++){
            //����numseq�����ݣ������ֱ�Ӽӣ�����ǿգ����res��ĸ���string,ÿ��β�ͼ���mirror��i����ŵ��ַ����Żء�
            if (res.size()==0){
                for (int j=0;j<mirror.get(numSeq[index]).length;j++){//mirror.get(numSeq[index])�����Ǹ�char[]
                    res.add( String.valueOf((mirror.get(numSeq[index]))[j]) );//String.valueOf((mirror.get(numSeq[index]))[j]);
                }
            }//�յ����
            else{
                char[] addons=mirror.get(numSeq[index]);
                ArrayList<String> tmp=new ArrayList<String>();
                for (int i=0;i<res.size();i++){
                    String pre=res.get(i);
                    int preLen=pre.length();
                    StringBuilder sbTmp=new StringBuilder(pre);
                    for (int j=0;j<addons.length;j++){
                        sbTmp.append(String.valueOf(addons[j]));//String.valueOf(addons[j]);
                        tmp.add(sbTmp.toString());
                        sbTmp.deleteCharAt(preLen);
                    }
                }
                res=tmp;

            }//�ǿյ����,else
        }
        return res;
        
        

    }//letterCombinations
    
}


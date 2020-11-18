package hello;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead=new ListNode();
        ListNode newPoint=newhead;//newhead是空的，必须看到下一项才行
        // ListNode l1p=l1;
        // ListNode l1n=l1;
        // ListNode l2p=l2;
        // ListNode l2n=l2;//L*,prev and next
        // l1n=l1n.next==null?l1p:l1n.next;
        // l2n=l2n.next==null?l2p:l2n.next;
        ListNode onep=l1;
        ListNode twop=l2;
        while (onep!=null||twop!=null){
            if (onep==null){
                newPoint.next=twop;
                twop=twop.next;
                newPoint=newPoint.next;
                continue;
            }
            else if (twop==null){
                newPoint.next=onep;
                onep=onep.next;
                newPoint=newPoint.next;
                continue;
            }
            else{;}

            if (onep.val==twop.val){
                newPoint.next=new ListNode(onep.val);
                newPoint=newPoint.next;
                newPoint.next=new ListNode(twop.val);
                newPoint=newPoint.next;
                onep=onep.next;
                twop=twop.next;
            }else{
                if (onep.val>twop.val){
                    newPoint.next=new ListNode(twop.val);
                    newPoint=newPoint.next;
                    twop=twop.next;
                }
                else {
                    newPoint.next=new ListNode(onep.val);
                    onep=onep.next;
                    newPoint=newPoint.next;
                }
            }
        }
        return newhead.next;

    }
}

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Brackets {
	public List<String> generateParenthesis(int n) {
        Set<String> hs = new HashSet<String>();
        List<String> result=new ArrayList<String>();
        StringBuilder sb=new StringBuilder("");
        
        embrace(sb,hs,n);
        result.addAll(hs);
		return result;
        
        
        
    }
    public void embrace(StringBuilder sb,Set<String> rcv,int times){
        String cache=sb.toString();
        StringBuilder left=new StringBuilder(cache);
        left.insert(0,"()");
        StringBuilder mid=new StringBuilder(cache);
        mid.insert(0,"(");mid.append(")");
        StringBuilder right=new StringBuilder(cache);
        right.append("()");
        if (times==1){
            rcv.add(left.toString());
            rcv.add(mid.toString());
            rcv.add(right.toString());
//            return rcv;
        }
        else{
            embrace(left,rcv,times-1);
            embrace(mid,rcv,times-1);
            embrace(right,rcv,times-1);
        }
    }
    

}


class CombinedLinked {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=new ListNode(114514);//结果需要返回HEAD的NEXT
        ListNode switcher=head;
        int len=lists.length;
        while (!isListAllEmpty(lists)){
            int min=1919810;
            int minIndex=-1;
            for (int i=0;i<lists.length;i++){
                if (lists[i]!=null&&lists[i].val<min){
                    minIndex=i;min=lists[i].val;
                } else{;}
            }
            switcher.next=new ListNode(min);
            switcher=switcher.next;
            lists[minIndex]=lists[minIndex].next;
        }
        return head.next;
        
    }
    public static boolean  isListAllEmpty(ListNode[] lists){
        for (int i=0;i<lists.length;i++){
            if (lists[i]!=null){return false;}
        }
        return true;
    }
    
}

class bracketCount {
	public int longestValidParentheses(String s) {
        char[] cs=s.toCharArray();
        // Stack <Integer> stk=new Stack<Integer>();
        // int max=0;
        if (s.length()<=1){
            return 0;
        }else{;}
        int leftb=0;
        int rightb=0;
        int max1=0;
        for (int i=0;i<s.length();i++){
            if (cs[i]=='('){
                leftb++;
            }else if (cs[i]==')'){
                rightb++;
            }else{;}
            if (rightb==leftb){
                max1=rightb+rightb>max1?rightb*2:max1;
                leftb=0;rightb=0;
            }
            else if (rightb>leftb){
                rightb=0;
                leftb=0;
            }else{;}
        }
        leftb=0;
        rightb=0;
        int max2=0;
        for (int i=s.length()-1;i>0;i--){
            if (cs[i]=='('){
                leftb++;
            }else if (cs[i]==')'){
                rightb++;
            }else{;}
            if (rightb==leftb){
                max2=rightb+rightb>max2?rightb*2:max2;
                leftb=0;rightb=0;
            }
            else if (leftb>rightb){
                rightb=0;
                leftb=0;
            }else{;}
        }
        return max2>max1?max2:max1;
    }
}

class midTerm {
    public int search(int[] nums, int target) {
        if (nums==null||nums.length==1) {return -1;}else {;}
        int start=0;int end=nums.length-1;
        int mid=0;
        while (start<end) {
        	mid=(start+end)/2;
        	if (nums[mid]==target) {return mid;}else {;}
        	if (nums[mid]>=start) {
        		if (target>=nums[start]&&target<nums[mid]) {
        			end=mid-1;
        		}
        		else {
        			start=mid+1;
        		}
        	}
        	else {
        		if (target<=nums[end]&&target>nums[mid]) {
        			start=mid+1;
        		}
        		else {
        			end=mid-1;
        			
        		}
        	}
        }
        if (nums[start]==target) {return start;}
        return -1;
    }//method
}//class

class rangeFinder {
    public int[] searchRange(int[] nums, int target) {
        int[] rcv;
        if (nums==null){
            rcv=new int[]{-1,-1};
            return rcv; 
        }//无效
        int len=nums.length;
        if (len==0){
            rcv=new int[]{-1,-1};
            return rcv; 
        }else if (len==1){
            if (target==nums[0]){
            rcv=new int[]{0,0};
            return rcv; 
            }
            else{
            rcv=new int[]{-1,-1};
            return rcv;
            }
        }//长度0或者1
        if (target<nums[0]||target>nums[nums.length-1]){
            rcv=new int[]{-1,-1};
            return rcv; 
        }else{;}//不在范围

        //二分查找
        int camp=114514;
        int left=0;int right=len-1;
        int mid=114514;
        while(left<=right){
            mid=(left+right)/2;
            if (target==nums[mid]){
                camp=mid;
                break;
            }
            else if (target<nums[mid]){
                right=mid-1;
            }
            else if (target>nums[mid]){
                left=mid+1;
            }
        }//while
        if (camp==114514){
            rcv=new int[]{-1,-1};
            return rcv; 
        }//大小符合，但不在里面
        else{;}
        int back=0;
        int forward=0;
        int campInt=nums[camp];
        while (camp+forward<len&&nums[camp+forward]==campInt) {
//        	forward++;
        	forward++;
        }
        forward=forward-1>0?forward-1:0;
        while (camp-back>=0&&nums[camp-back]==campInt) {
        	back++;
        }
        back=back-1>0?back-1:0;
        rcv=new int[]{camp-back,camp+forward};
        return rcv; 




    }//method
}//class



class findAllAddons {
	static List<List<Integer>> finll=new ArrayList<List<Integer>>();
	static List <String > tmpCmp=new ArrayList<String>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	finll.clear();
    	tmpCmp.clear();
        Arrays.sort(candidates);
        int len=candidates.length;
        for (int i=0;i<len;i++){
            List<Integer> initaial=new ArrayList<Integer>();
            diveIn(0,initaial,candidates,target);
        }
        return finll;
        
    }
    public static void diveIn(int sumPrev,List<Integer> rcv,int [] candidates,int target){
        int bullseye=target-sumPrev;
        for (int i=0;i<candidates.length;i++){
            if (candidates[i]>bullseye){
                return;
            }
            else if (candidates[i]==bullseye){
                rcv.add(candidates[i]);
                List<Integer> tmp=new ArrayList<Integer>();
                for (Integer inm:rcv){
                   tmp.add(inm);
                }
                Collections.sort(tmp);
                if (tmpCmp.contains(tmp.toString())) {
                	;
                }else {
                	tmpCmp.add(tmp.toString());
                	finll.add(tmp);
                }
                rcv.remove(rcv.size()-1);
                return;

            }
            else{
                rcv.add(candidates[i]);
                diveIn(sumPrev+candidates[i],rcv,candidates,target);
                rcv.remove(rcv.size()-1);
            }
        }
        // int bullseye=target-sumPrev;
        // if (startIndex>=candidates.length||startIndex<0){
        //     return;
        // }else{;}
        // if (candidates[startIndex]>bullseye){
        //     return;
        // }
        // else if (bullseye==candidates[startIndex]){
        //     rcv.add(candidates[startIndex]);
        //     // fin.add(rcv);
        //     List<Integer> tmp=new List<Integer>();
        //     for (Integer i:rcv){
        //         tmp.add(i);
        //     }
        //     fin.add(tmp);
        //     return;
        // }
        // else{
        //     for (int i=startIndex;i<candidates.length;i++){
        //         rcv.add(candidates[i]);
        //         diveIn(sumPrev+candidates[i],rcv,i+1,candidates,target);
        //         rcv.remove(rcv.size()-1);
        //     }
        // }
    }//diveIn
}//class

class waterContainer {
    public int trap(int[] height) {
    	if (height==null||height.length==0) {return 0;}
        int size=height.length;
        int sum=0;
        int [] leftMax=new int [size];
        int [] rightMax=new int [size];
        int [] realMax=new int[size];
        leftMax[0]=height[0];
        for (int i=1;i<size;i++) {
        	leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        rightMax[size-1]=height[size-1];
        for (int j=size-2;j>=0;j--) {
        	rightMax[j]=Math.max(rightMax[j+1], height[j]);
        }
        for (int i=0;i<size;i++) {
        	realMax[i]=Math.min(rightMax[i], leftMax[i]);
        }
        for (int i=0;i<size;i++) {
        	sum+=realMax[i]-height[i];
        }
        return sum;
        
    }//method
}//calss

class allDisplay {
    public List<List<Integer>> permute(int[] nums) {
        int size=nums.length;
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> oneSet=new ArrayList<Integer>();
        List <Integer> base=new ArrayList<Integer>();
        for (int i:nums){
            base.add(i);
        }
        depth(oneSet,base,res);
        return res;
    }
    public  static void depth(List<Integer>oneRes,List<Integer>base,List<List<Integer>> finalRes){
        if (base.size()==0){
        	List<Integer> tmp=new ArrayList<Integer>(oneRes);
            finalRes.add(tmp);
        }
        for (int i=0;i<base.size();i++){
            Integer tmp=base.get(i);
            oneRes.add(tmp);
            base.remove(i);
            depth(oneRes,base,finalRes);
            base.add(i,tmp);
            oneRes.remove(oneRes.size()-1);
        }
    }
}


class matrixRevolve {
    public void rotate(int[][] matrix) {
        int size=matrix[0].length;
        for (int i=0;i<=size-1;i++){
            for (int j=i;j<=size-1;j++){
                swap(matrix,i,j);
            }
        }
        vertiReflect(matrix);

    }
    public static void swap(int [][] acc,int x1,int y1){
        if (x1==y1){
            return;
        }
        else{
            int mirrorx=y1;
            int mirrory=x1;
            int tmp=acc[x1][y1];
            acc[x1][y1]=acc[mirrorx][mirrory];
            acc[mirrorx][mirrory]=tmp;
            return;
        }
    }
    public void vertiReflect(int [][]acc){
        double signCenter=(acc[0].length-1)/2;int size=acc[0].length;
        for (int i=0;i<=signCenter;i++){
            int refY=acc[0].length-1-i;//acc[0].length-1-i
            for (int j=0;j<=size-1;j++){
//                int tmp=acc[i][j];
//                acc[i][j]=acc[refX][j];
//                acc[refX][j]=tmp;
            	int tmp=acc[j][i];
            	acc[j][i]=acc[j][refY];
            	acc[j][refY]=tmp;
            }
        }

    }
}

class YiWeiCi {
	public void sortColors(int[] nums) {
        int ri=nums.length-1;
        int li=0;
        while (ri>li){
            while (nums[ri]>=1&&ri>li){
                ri--;
            }
            while (nums[li]<=1&&ri>li){
                li++;
            }
            if (ri>li){
                int tmp=nums[ri];
                nums[ri]=nums[li];
                nums[li]=tmp;
            }

        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> fin=new ArrayList<List<String>>();
        HashMap<String , ArrayList<Integer>> hs=new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[] chs=strs[i].toCharArray();
            Arrays.sort(chs);
            String tmp=new String(chs);
            if (!hs.containsKey(tmp)) {
            	ArrayList<Integer> value=new ArrayList<Integer>();
            	value.add(i);
            	hs.put(tmp, value);
            }
            else {
            	hs.get(tmp).add(i);
            }
        }
        Collection<ArrayList<Integer>> mid= hs.values();
//        int groupNum=hs.size();
//        for (int i=0;i<groupNum;i++) {
//        	List<String> tmpFin=new ArrayList<String>();
//        	
//        }
        for (ArrayList<Integer> arr : mid) {
        	List<String> tmpFin=new ArrayList<String>();
//        	List<String> component=new ArrayList<String>();
        	arr.forEach(x->tmpFin.add(strs[x]));
        	fin.add(tmpFin);
		}
		return fin;
        
    }//method
}//class

class Combination {
	public int uniquePaths(int m, int n) {
        int stepm=m-1;
        int stepn=n-1;
        int result=0;
        int totalSteps=stepm+stepn;
        return combinations(totalSteps,stepn);

    }
    public int combinations(int buttom,int head){
        int m=buttom;
        int n=head;
//        BigDecimal m=new BigDecimal(buttom);
//        BigDecimal n=new BigDecimal(head);
        if (m<n){return 0;}
        else if (m==n) {return 1;}
        else{;}
        n=m-n>n?n:m-n;
        long res=1;
        for (int i=1;i<=n;i++) {
        	res*=(long)((m+1)-i);
        	res/=(long)i;
        }
        return (int)res;
    }
}

class JumpStairs {
    static int total=0;
    public int climbStairs(int n) {
        if (n<2){return 1;}
        else{;}
        stepUp(n);
        int fin=total;
        total=0;
        return fin;
    }
    private void stepUp(int left){
        if (left==0){total++;return;}
        else if (left==1){total++;return;}
        else{
            stepUp(left-1);
            stepUp(left-2);
        }

    }
}


public class NewLinked {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpStairs jpsr=new JumpStairs();
		System.out.println(jpsr.climbStairs(4));
		Combination cbn=new Combination();
		int cbnRes=cbn.uniquePaths(23, 12);
		List<int[]>ls=new ArrayList<int[]>() ;
//		int [] jm= {2,0};
//		jmpS jms=new jmpS();
//		jms.canJump(jm);
		YiWeiCi ywc=new YiWeiCi();
		ywc.sortColors(new int []{2,0,2,1,1,0});
		String[] anagramTest= {"eat", "tea", "tan", "ate", "nat", "bat"};
		ywc.groupAnagrams(anagramTest);
		
		matrixRevolve mr=new matrixRevolve();
		int [][] newbie= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		mr.rotate(newbie);
		allDisplay ap=new allDisplay();
		int [] permut= {1,2,3};
		ap.permute(permut);
		waterContainer wc=new waterContainer();
		int [] wcTest= {0,1,0,2,1,0,1,3,2,1,2,1};
		int wcResult=wc.trap(wcTest);
		findAllAddons fal=new findAllAddons();
		int [] candidates= {2,3,6,7};
		int target=7;
		List<List<Integer>> combiRes= fal.combinationSum(candidates, target);
		
		int [] candidates2= {2,3,5};
		int target2=8;
		List<List<Integer>> combiRes2= fal.combinationSum(candidates2, target2);
		
		List<List<Integer>> fin=new ArrayList<List<Integer>>();
		rangeFinder rf=new rangeFinder();
		int[] tstarr=new int[] {1,1,2};
		rf.searchRange(tstarr, 1);
		int [] testArrayInt= {3,5,1};
		midTerm mdt=new midTerm();
		int aftky= mdt.search(testArrayInt, 3);
				
		bracketCount bc=new bracketCount();
		int bcc=bc.longestValidParentheses("()(()");
		
		
		CombinedLinked tst=new CombinedLinked();
		
		
		
		Brackets b=new Brackets();
		b.generateParenthesis(3);
		
		
		ListNode one=new ListNode(1);
		ListNode p1=one;
		p1.next=new ListNode(2);
		p1=p1.next;
		p1.next=new ListNode(4);
		p1=p1.next;
//		p1.next=new ListNode(5);
//		p1=p1.next;
		ListNode two=new ListNode(1);
		ListNode p2=two;
//		p2.next=new ListNode(2);
//		p2=p2.next;
		p2.next=new ListNode(3);
		p2=p2.next;
		p2.next=new ListNode(4);
		p2=p2.next;
		ListNode[] nodes=new ListNode[2];
		nodes[0]=one;nodes[1]=two;
		tst.mergeKLists(nodes);
//		ListNode test= Solution.mergeTwoLists(one, two);
	}

}

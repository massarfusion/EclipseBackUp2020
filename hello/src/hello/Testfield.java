package hello;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testfield {

	public static void main(String[] args) {
		int [] arr= {9,7,8,16,20};
		partition(arr, 0, 4);
		System.out.print("no");
		
	}
	private static int partition(int[] arr, int low, int high) {
		   //�����¼
		   int pivot = arr[low];
		   while (low < high) {
		       while (low < high && arr[high] >= pivot) --high;
		       //����������С�ļ�¼�����
		       arr[low] = arr[high];
		       while (low < high && arr[low] <= pivot) ++low;
		       //����������С�ļ�¼���Ҷ�
		       arr[high] = arr[low];
		   }
		   //ɨ����ɣ����ᵽλ
		   arr[low] = pivot;
		   //���ص��������λ��
		   return low;
		}
}

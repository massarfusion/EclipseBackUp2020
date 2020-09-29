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
		   //枢轴记录
		   int pivot = arr[low];
		   while (low < high) {
		       while (low < high && arr[high] >= pivot) --high;
		       //交换比枢轴小的记录到左端
		       arr[low] = arr[high];
		       while (low < high && arr[low] <= pivot) ++low;
		       //交换比枢轴小的记录到右端
		       arr[high] = arr[low];
		   }
		   //扫描完成，枢轴到位
		   arr[low] = pivot;
		   //返回的是枢轴的位置
		   return low;
		}
}

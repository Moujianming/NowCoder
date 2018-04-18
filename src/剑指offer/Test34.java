package 剑指offer;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * @author moujianming
 *2018年4月11日:下午4:12:52
 *功能在数组中的两个数字，如果前面一个数字大于后面的数字，
 *则这两个数字组成一个逆序对。输入一个数组,求出这个数组中
 *的逆序对的总数P。并将P对1000000007取模的结果输出。 
 *即输出P%1000000007
 */
public class Test34 {

	public int InversePairs(int [] array) {
      if(array.length==2)
      {
    	  return array[0]>array[1]?1:0;
      }
      int count = 0;
      for (int i = 0; i < array.length-1; i++) {
		if(array[i]>array[array.length-1])
		count++;
	}
      int[] arr = new int[array.length-1];
      System.arraycopy(array, 0, arr, 0, arr.length);
      return count+InversePairs(arr)%1000000007;
    }
	//method2

	public int InversePairsII(int [] array) {		int count = 0;
	for (int i = 0; i < array.length; i++) {
		for (int j = i; j < array.length; j++) {
			if(array[i]>array[j])
			{
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				count++;
				count=count%1000000007;
			}
		}
	}
	return count;}
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,0,9};
		System.out.println(new Test34().InversePairsII(a));
	}
}

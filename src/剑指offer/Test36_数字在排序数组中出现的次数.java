package 剑指offer;
/**
 * 
 * @author:moujianming
 *2018年4月28日:下午3:26:48
 * 问题描述:统计一个数字在排序数组中出现的次数。
 */
public class Test36_数字在排序数组中出现的次数 {
	 public int GetNumberOfK(int [] array , int k) {
	       int result = 1;
	       int locat = FindLocation(array, k, 0, array.length-1);
	       if(locat==-1)return 0;
	       int head = locat;
	       int tail = locat;
	       while(head>0&&array[--head]==k) result++;
	       while(tail<array.length-1&&array[++tail]==k) result++;	       
	       return result;
	    }
	 public int FindLocation(int[] array,int k,int begin,int end)
	 {
		 if(begin>end)
		 {
			 return -1;
		 }else
		 {
			 int mid = (begin+end)/2;
			 if(array[mid]==k)
			 {
				 return mid;
			 }else if(array[mid]>k)
			 {
				 return FindLocation(array, k, begin, mid-1);
			 }else
			 {
				 return FindLocation(array, k, mid+1, end);
			 }
		 }
	 }
	public static void main(String[] args) {
		int[] a = {1,2,3,3,3,3};
		Test36_数字在排序数组中出现的次数 test36 = new Test36_数字在排序数组中出现的次数();
		System.out.println(test36.GetNumberOfK(a, 3));
	}
}

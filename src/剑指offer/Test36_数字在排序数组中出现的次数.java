package ��ָoffer;
/**
 * 
 * @author:moujianming
 *2018��4��28��:����3:26:48
 * ��������:ͳ��һ�����������������г��ֵĴ�����
 */
public class Test36_���������������г��ֵĴ��� {
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
		Test36_���������������г��ֵĴ��� test36 = new Test36_���������������г��ֵĴ���();
		System.out.println(test36.GetNumberOfK(a, 3));
	}
}

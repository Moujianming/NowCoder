package 剑指offer;
/**
 * 
 *2018-4-2下午05:41:28
 * @author moujianming
 * 实现功能：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 */
public class Test22_二叉搜索树的后序遍历序列 {
	 public boolean VerifySquenceOfBST(int [] sequence) {
	       return Verify(sequence); 
	    }
	 public boolean Verify(int[] array)
	 {
		 boolean b1 = true,b2 = true;
		 if(array.length==0)
			 return true;
		 int locat = 0;
		 for(int i=0;i<array.length-1;i++)
		 {
			 if(array[i]<array[array.length-1])
			 {
				 locat++;
			 }
		 }
		 for(int i=locat;i<array.length-1;i++)
		 {
			 if(array[i]<array[array.length-1])
			 {
				  return false;
			 }
		 }
		 int[] arr1 = new int[locat];
		 int[] arr2 = new int[array.length-locat-1];
		 System.arraycopy(array, 0, arr1, 0, arr1.length);
		 System.arraycopy(array, locat, arr2, 0, arr2.length);
		return Verify(arr1)&&Verify(arr2);	 
	 }
	public static void main(String[] args) {
		//int[] seq = {2,9,5,16,17,15,19,18,12};
		int[] seq = {7,4,6,5};
		Test22_二叉搜索树的后序遍历序列 t = new Test22_二叉搜索树的后序遍历序列();
		System.out.println(t.VerifySquenceOfBST(seq));
	}
}

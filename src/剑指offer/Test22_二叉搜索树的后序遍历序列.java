package ��ָoffer;
/**
 * 
 *2018-4-2����05:41:28
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 *
 */
public class Test22_�����������ĺ���������� {
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
		Test22_�����������ĺ���������� t = new Test22_�����������ĺ����������();
		System.out.println(t.VerifySquenceOfBST(seq));
	}
}

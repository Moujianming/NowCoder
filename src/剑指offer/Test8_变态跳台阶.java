package ��ָoffer;
/**
 * 
 *2018-3-31����09:59:36
 * @author moujianming
 * ʵ�ֹ��ܣ�һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 *
 */
public class Test8_��̬��̨�� {



	public int JumpFloorII(int target) {
      if(target<=0)
    	  return 0;
      if(target ==1)
          return 1;
      if(target==2)
    	  return 2;
      int result = 0;
      if(target>=3)
      {
    	  for(int i = target;i>=1;i--)
    	  {
    		  result = JumpFloorII(target-i)+result;
    	  }
      }
      return result+1;
    }
	
	public static void main(String[] args) {
		System.out.println(new Test8_��̬��̨��().JumpFloorII(3));
	}
}

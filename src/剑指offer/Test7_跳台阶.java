package ��ָoffer;
/**
 * 
 *2018-3-31����09:40:52
 * @author moujianming
 * ʵ�ֹ��ܣ�һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 *
 */
public class Test7_��̨�� {


	  public int JumpFloor(int target) {

		  if(target<=0)
			  try {
				throw new Exception("target ����������");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		  
		  if(target==1)
			  return 1;
		  if(target==2)
			  return 2;
		  int result = 0;
		  if(target>2)
		  {
			  result = JumpFloor(target-1)+JumpFloor(target-2);
		  }
		  return result;
	    }
	public static void main(String[] args) {
		System.out.println(new Test7_��̨��().JumpFloor(3));
	}
}

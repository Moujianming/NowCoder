package ��ָoffer;
/**
 * 
 *2018-3-31����03:58:37
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ��������ת�����������������Ԫ�ء�
 *
 */
public class Test14_��ת���� {


	 public ListNode ReverseList(ListNode head) {

		 ListNode result =null;
		 ListNode temp = null;
		 while(head!=null)
		 {
			 temp = new ListNode(head.val);
			 temp.next = result;	
			 result = temp;
			 head = head.next;
		 }
		
		 return result;
	    }
	
	public static void main(String[] args) {
		
	}
}

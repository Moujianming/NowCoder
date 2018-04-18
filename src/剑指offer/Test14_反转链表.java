package 剑指offer;
/**
 * 
 *2018-3-31下午03:58:37
 * @author moujianming
 * 实现功能：输入一个链表，反转链表后，输出链表的所有元素。
 *
 */
public class Test14_反转链表 {


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

package 剑指offer;
/**
 * 
 *2018-3-31下午03:36:09
 * @author moujianming
 * 实现功能：输入一个链表，输出该链表中倒数第k个结点。
 */
public class Test13_链表中倒数第k个结点 {

	 
	public ListNode FindKthToTail(ListNode head,int k) {

		if(head==null)
			return null;
		ListNode i = head;
		ListNode j =head;
		int step = 1;
		while(step<k&&j.next!=null)
		{
			step++;
			j=j.next;
		}
		if(step!=k)
		{
			return null;	
		}else
		{
			while(j.next!=null)
			{
				j = j.next;
				i = i.next;
			}
		}
		
		return i;
	    }
	
	public static void main(String[] args) {
		
	}
}

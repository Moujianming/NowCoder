package ��ָoffer;
/**
 * 
 *2018-3-31����03:36:09
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ����������������е�����k����㡣
 */
public class Test13_�����е�����k����� {

	 
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

package 剑指offer;
/**
 * 
 * @author:moujianming
 *2018年4月28日:下午3:10:32
 * 问题描述:输入两个链表，找出它们的第一个公共结点。
 */
public class Test35_两个链表的第一个公共结点 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode result = null;
		ListNode p2 = null;
		while(pHead1!=null)
		{
			p2 = pHead2;
			while(p2!=null)
			{
				if(pHead1==p2)
				{
					result = p2;
					//result.next = null;
					break;
				}
				p2 = p2.next;
			}
			if(result!=null)break;
			pHead1 = pHead1.next;
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		
	}
}

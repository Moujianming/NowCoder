package ��ָoffer;
/**
 * 
 * @author:moujianming
 *2018��4��28��:����3:10:32
 * ��������:�������������ҳ����ǵĵ�һ��������㡣
 */
public class Test35_��������ĵ�һ��������� {
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

package ��ָoffer;

import java.util.ArrayList;

/**
 * 
 *2018-3-29����04:34:13
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
 *
 */
public class Test2_��β��ͷ��ӡ���� {


	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(listNode!=null)
		{
			list.add(listNode.val);
			listNode = listNode.next;
		}
		for(int i = list.size()-1;i>=0;i--)
		{
			result.add(list.get(i));
		}
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	/**
	 * ���Խ�����ջ��˼��Stack
	 */

}

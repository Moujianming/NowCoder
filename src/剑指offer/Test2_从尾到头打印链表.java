package 剑指offer;

import java.util.ArrayList;

/**
 * 
 *2018-3-29下午04:34:13
 * @author moujianming
 * 实现功能：输入一个链表，从尾到头打印链表每个节点的值。
 *
 */
public class Test2_从尾到头打印链表 {


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
	 * 可以借助堆栈的思想Stack
	 */

}

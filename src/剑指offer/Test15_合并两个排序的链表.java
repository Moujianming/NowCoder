package 剑指offer;
/**
 * 
 *2018-3-31下午04:09:44
 * @author moujianming
 * 实现功能：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 *
 */
public class Test15_合并两个排序的链表 {


/**
 * 
 * @param list1
 * @param list2
 * @return链表正插法java比较难实现
 */
	public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result = null;
        if(list1!=null&&list2!=null)
        {
        	if(list1.val<=list2.val)
        	{
        		result = new ListNode(list1.val);
        		result.next = Merge(list1.next,list2);
        		return result;
        	}else
        	{
        		result = new ListNode(list2.val);
        		result.next = Merge(list1,list2.next);
        		return result;
        	}
        }
        if(list1!=null&&list2==null)
        {
        	return list1;
        }
        if(list1==null&&list2!=null)
        {
        	return list2;
        }
        return result;
    }
	
	public static void main(String[] args) {
		
	}
}

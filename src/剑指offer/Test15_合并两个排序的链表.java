package ��ָoffer;
/**
 * 
 *2018-3-31����04:09:44
 * @author moujianming
 * ʵ�ֹ��ܣ����������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 *
 */
public class Test15_�ϲ�������������� {


/**
 * 
 * @param list1
 * @param list2
 * @return�������巨java�Ƚ���ʵ��
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

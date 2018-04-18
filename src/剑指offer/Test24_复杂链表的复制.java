package 剑指offer;
/** 
 * @author 377321
 *输入一个复杂链表（每个节点中有节点值，以及两个指针，
 *一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 *（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Test24_复杂链表的复制 {
	 public RandomListNode Clone(RandomListNode pHead)
	    {
	        RandomListNode head = null;
	        RandomListNode p = new RandomListNode(pHead.label),q;
	        head = p;
	        q = pHead.next;
	        while(q!=null)
	        {
	        	 //p.next;	 
	        	p.next = new RandomListNode(q.label);
	        	p = p.next;
	        	q =q.next;
	        	       	
	        }
	        p = head;
	        q = pHead;
	        while(q!=null)
	        {
	           RandomListNode temp1 = pHead;
	           int count = 0;
	           while(temp1!=null)
	           {
	        	   if(q.random==temp1)
	        	   {
	        		   break;
	        	   }else
	        	   {
	        		   temp1 = temp1.next;
	        		   count++;
	        	   }
	           }
	           RandomListNode temp2 = head;
	           while(temp2!=null)
	           {
	        	   if(count==0)
	        	   {
	        		   p.random = temp2;
	        		   break;
	        	   }else
	        	   {
	        		   count--;
	        		   temp2 = temp2.next;
	        	   }
	           }
	           q = q.next;
	           p = p.next;
	        }
	        return head;
		/* RandomListNode head = null;
		 if(pHead==null)
		 {
			 return null;
		 }
		 head = new RandomListNode(pHead.label);
		 head.next = pHead.next;
		 head.random = pHead.random;
		 head.next = Clone(pHead.next);
		 return head;*/
	    }
	public static void main(String[] args) {
		RandomListNode p1 = new RandomListNode(1);
		RandomListNode p2 = new RandomListNode(2);
		RandomListNode p3 = new RandomListNode(3);
		RandomListNode p4 = new RandomListNode(14);
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p1.random = p3;
		p2.random = p4;
		p3.random = p2;
		p4.random = p1;
		new Test24_复杂链表的复制().Clone(p1);
		
	}
}

package ��ָoffer;

/*import java.util.ArrayList;
import java.util.Stack;*/

/**
 * 
 *2018-4-2����09:24:04
 * @author moujianming
 * ʵ�ֹ��ܣ��������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 *
 */
public class Test16_�����ӽṹ {
/*
	//������ǰ�����
	//�ǵݹ�
	public static ArrayList<Integer> PreSearch(TreeNode bt)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(bt!=null||!stack.empty())
		{
			if(bt!=null)
			{
				stack.push(bt);
				list.add(bt.val);
				bt = bt.left;
			}
			else
			{
				bt = stack.pop();
				bt = bt.right;
			}
		}
		
		return list;
	}
	static ArrayList<Integer> list = new ArrayList<Integer>();
	//�������ĵݹ��������
	public static void  MidSearch(TreeNode bt)
	{
	
		if(bt!=null)
		{
			MidSearch(bt.left);
			list.add(bt.val);
			MidSearch(bt.right);
		}
	}

	 public boolean HasSubtree(TreeNode root1,TreeNode root2) {
	        
		 boolean result = false;
		 
		 //ǰ�����
		 ArrayList<Integer> pre1 = PreSearch(root1);
		 ArrayList<Integer> pre2 = PreSearch(root2);
		 
		 //�������
		ArrayList<Integer> mid1 = new ArrayList<Integer>();
		ArrayList<Integer> mid2 = new ArrayList<Integer>();
		
		 MidSearch(root1);		
		 mid1.addAll(list);
		 list.removeAll(list);
		 
		MidSearch(root2);
		mid2.addAll(list);
	    list.removeAll(list);
	   
	    boolean count1 = false,count2 = false;
	    for(int i = 0;i<pre1.size()-pre2.size();i++)
	    {
	    	if(pre1.get(i) == pre2.get(0))
	    	{
	    		if(pre1.subList(i, i+pre2.size()).equals(pre2))
	    		{
	    			count1 = true;
	    		}
	    	}
	    }
	    for(int i = 0;i<mid1.size()-mid2.size();i++)
	    {
	    	if(mid1.get(i) == mid2.get(0))
	    	{
	    		if(mid1.subList(i, i+mid2.size()).equals(mid2))
	    		{
	    			count2 = true;
	    		}
	    	}
	    }
		 				 
		 if(count1&&count2)
			 result  =true;
		 return result;
	    }
	*/

	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root2==null||root1==null)
        	return false;
        result  = DoesTreeSet(root1, root2)||HasSubtree(root1.left, root2)||HasSubtree(root1.right, root2);
        return result;
    }
	public boolean DoesTreeSet(TreeNode root1,TreeNode root2)
	{
		boolean result = false;
		if(root2==null&&root1!=null)
			return true;
		if(root1==null&&root2!=null)
		    return false;
		if(root1==null&&root2==null)
			return true;
		if(root1!=null&&root2!=null)
		{
			if(root1.val==root2.val)
			{
				result = DoesTreeSet(root1.left, root2.left)&&DoesTreeSet(root1.right, root2.right);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
	}
}

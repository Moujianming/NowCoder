package ��ָoffer;

import java.util.ArrayList;

/**
 * 
 *2018-4-2����07:21:49
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 *
 */
public class Test23_�������к�Ϊĳһֵ��·�� {
	 //������ȱ���
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	        if(root==null)return result;
	        list.add(root.val);
	        target-=root.val;
	        if(target==0&&root.left==null&&root.right==null)
	        {
	        	result.add(new ArrayList<Integer>(list));
	        }
	       FindPath(root.left, target);
	       FindPath(root.right,target);
	       list.remove(list.size()-1);
	       return result;
	    }
	
	  /*public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		// Stack<TreeNode> stack = new Stack<TreeNode>();
		 if(root!=null)
		 {
			 if(root.left==null&&root.right==null)
			 {
				 ArrayList<Integer> list = new ArrayList<Integer>();
				 list.add(root.val);
			 }
		 }*/
		 
		 /*
		 //stack.push(root);
		 TreeNode p = root;
		 while(!stack.empty()||p!=null)
		 {
			if(p!=null)
			{
				stack.push(p);
				p = p.left;
			}else
			{
				p = stack.peek();
				if(p.left==null&&p.right==null)
				{
					int sum = 0;
					Iterator<TreeNode> it = stack.iterator();
					 while(it.hasNext())
					 {
						 sum+=it.next().val;
					 }
				
					 Iterator<TreeNode> i = stack.iterator();
					if(sum==target)
					{
						 ArrayList<Integer> list = new ArrayList<Integer>();
						 while(i.hasNext())
						 {
							list.add(i.next().val);
						 }
						result.add(list);
						
					}
					
				}
				stack.pop();
				p = p.right;
			}
		 }
		 
		 
		 return result;
	    }*/
	public static void main(String[] args) {
		Test23_�������к�Ϊĳһֵ��·�� t = new Test23_�������к�Ϊĳһֵ��·��();
		TreeNode a1 = new TreeNode(10);
		TreeNode a2 = new TreeNode(5);
		TreeNode a3 = new TreeNode(12);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(7);
		//TreeNode a6 = new TreeNode(9);
		//TreeNode a7 = new TreeNode(11);
		a1.left = a2;
		a1.right = a3;
		
		a2.left = a4;
		a2.right = a5;
		
		//a3.left = a6;
		//a3.right = a7;
		 ArrayList<ArrayList<Integer>> findPath = t.FindPath(a1, 22);
		System.out.println();
	}
}

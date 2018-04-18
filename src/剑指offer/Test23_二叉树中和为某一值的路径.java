package 剑指offer;

import java.util.ArrayList;

/**
 * 
 *2018-4-2下午07:21:49
 * @author moujianming
 * 实现功能：输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 */
public class Test23_二叉树中和为某一值的路径 {
	 //考查深度遍历
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
		Test23_二叉树中和为某一值的路径 t = new Test23_二叉树中和为某一值的路径();
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

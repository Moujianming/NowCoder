package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 *2018-4-2下午05:02:46
 * @author moujianming
 * 实现功能：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 */
public class Test21_二叉树层次遍历 {
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		 if(root==null)
			 return null;
	       ArrayList<Integer> result = new ArrayList<Integer>();
	       LinkedList<TreeNode> q = new LinkedList<TreeNode>();
	       q.add(root);
	       while(q.size()!=0)
	       {
	    	   System.out.println(q.peek().val);
	    	   if(q.peek().left!=null) q.add(q.peek().left);
	    	   if(q.peek().right!=null) q.add(q.peek().right);
	    	   result.add(q.poll().val);
	       }
	       return result;
	    }
	public static void main(String[] args) {
		Test21_二叉树层次遍历 t = new Test21_二叉树层次遍历();
		TreeNode a1 = new TreeNode(8);
		TreeNode a2 = new TreeNode(6);
		TreeNode a3 = new TreeNode(10);
		TreeNode a4 = new TreeNode(5);
		TreeNode a5 = new TreeNode(7);
		TreeNode a6 = new TreeNode(9);
		TreeNode a7 = new TreeNode(11);
		a1.left = a2;
		a1.right = a3;
		
		a2.left = a4;
		a2.right = a5;
		
		a3.left = a6;
		a3.right = a7;
		t.PrintFromTopToBottom(a1);
	}
}

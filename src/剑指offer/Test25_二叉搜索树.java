package 剑指offer;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 
 * @author:moujianming
 *2018年4月8日:下午7:05:51
 * 问题描述:输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Test25_二叉搜索树 {
	static LinkedList<TreeNode> list = new LinkedList<>();
	public static void GetLink(TreeNode rootNode)
	{
		if(rootNode!=null)
		{
			GetLink(rootNode.left);
			list.add(rootNode);
			GetLink(rootNode.right);
		}
			
		
	}
	 public TreeNode Convert(TreeNode pRootOfTree) {
	     if(pRootOfTree==null||(pRootOfTree.left==null&&pRootOfTree.right==null))
	    	 return pRootOfTree;
	     GetLink(pRootOfTree);
		 TreeNode root = null;
	     ListIterator<TreeNode> iterator = list.listIterator();
	     int begin = 0;
	     int end = list.size()-1;
	     int i =0;
	     //end>=2
	     while(iterator.hasNext())
	     {
	    	 System.out.println(iterator.next().val);
	    	/* if(i==begin)
	    	 {
	    		 root = iterator.next();
	    		 root.left=null;
	    		 root.right = iterator.next();
	    		 i++;
	    	 }
	    	 {
	    		 TreeNode node = iterator.previous();
	    		 node.left = iterator.previous();
	    		 iterator.next();
	    		 iterator.next();
	    		 node.right = iterator.next();
	    		 i++;
	    		 //System.out.println(node.left.val);
	    		if(i==end)
		    	 {
		    		 TreeNode node1 = iterator.previous();
		    		 node1.left = iterator.previous();
		    		 node1.right = null;
		    		 iterator.next();
		    		 iterator.next();
		    		 System.out.println(node1.left.val);
		    	 }
	    	 }	*/
	     }
	     return root;
	    }

	public static void main(String[] args) {
		/* TreeNode node1 = new TreeNode(12);
		 TreeNode node2 = new TreeNode(5);
		 TreeNode node3 = new TreeNode(18);
		 TreeNode node4 = new TreeNode(2);
		 TreeNode node5 = new TreeNode(16);
		 TreeNode node6 = new TreeNode(17);
		 TreeNode node7 = new TreeNode(19);
		 node1.left = node2;
		 node2.left = node4;
		 node1.right = node3;
		 node3.left = node5;
		 node5.right = node6;
		 node3.right = node7;*/
		 TreeNode node1 = new TreeNode(5);
		 TreeNode node2 = new TreeNode(4);
		 TreeNode node3 = new TreeNode(3);
		 TreeNode node4 = new TreeNode(2);
		 TreeNode node5 = new TreeNode(1);
		 node1.left = node2;
		 node2.right = node3;
		 node3.right = node4;
		 node4.right = node5;
		 new Test25_二叉搜索树().Convert(node1);
	}
}
//用时1小时20分
package 剑指offer;
/**
 * 
 * @author:moujianming
 *2018年4月28日:下午3:51:53
 * 问题描述:输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class Test37 {

	public int TreeDepth(TreeNode root) {
		if(root.left!=null&&root.right!=null)
		{
			return TreeDepth(root.left)>TreeDepth(root.right)?TreeDepth(root.left)+1:TreeDepth(root.right)+1;
		}else if(root.left!=null&&root.right==null)
		{
			//rerutn
		}
        return 0;
    }
	public static void main(String[] args) {
		
	}
}

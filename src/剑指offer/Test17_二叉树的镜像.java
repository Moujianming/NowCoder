package 剑指offer;
/**
 * 
 *2018-4-2下午02:12:49
 * @author moujianming
 * 实现功能：操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 */
public class Test17_二叉树的镜像 {


	public void Mirror(TreeNode root) {
        if(root!=null)
        {
        	TreeNode temp = root.left;
        	root.left = root.right;
        	root.right = temp;
        	Mirror(root.left);
        	Mirror(root.right);
        }
    }
	
	public static void main(String[] args) {
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
		
		new Test17_二叉树的镜像().Mirror(a1);
		System.out.println(a1);
	}
}

package 剑指offer;
/**
 * 
 *2018-3-29下午04:49:28
 * @author moujianming
 * 实现功能：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 */
public class Test3_重建二叉树 {


	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode result=null;
        if(pre.length!=0)
        {
        	result = new TreeNode(pre[0]);
        	int locat = 0;
        	for(int i = 0;i<in.length;i++)
        	{
        		if(in[i] == pre[0])
        		{
        			locat = i;
        			break;
        		}
        	}
        	if(locat ==0)
        	{
        		result.left = null;
        	}else
        	{
        		int[] right = new int[locat];
        		System.arraycopy(in, 0, right, 0, locat);
        		int[] left = new int[locat];
        		System.arraycopy(pre, 1, left, 0, locat);
        		result.left = reConstructBinaryTree(left, right);
        		
        	}
        	if(in.length-1==locat)
        	{
        		result.right = null;
        	}else
        	{
        		int[] right = new int[in.length-1-locat];
        		System.arraycopy(in, locat+1, right, 0, right.length);
        		int[] left = new int[pre.length-1-locat];
        		System.arraycopy(pre, locat+1, left, 0, left.length);
        		result.right = reConstructBinaryTree(left,right);
        	}
        	
        	//result.left = reConstructBinaryTree()
        }
        	
        return result;
    }
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		new Test3_重建二叉树().reConstructBinaryTree(pre, in);
	}
}

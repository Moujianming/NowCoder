package ��ָoffer;
/**
 * 
 * @author:moujianming
 *2018��4��28��:����3:51:53
 * ��������:����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
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

package ��չ��ϰ;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * @author ������
 * @email  547139255@qq.com
 * @detail ���򴴽� ���ֱ��� ������  
 */
/*
 * ���򴴽������ ������
 * ���� ������
 * 
 * �����ο��ԣ�http://www.cnblogs.com/llhthinker/p/4906631.html
 * �����ο��ԣ�http://blog.csdn.net/sjf0115/article/details/8645991
 */

public class BinaryTree<T>
{
    /*
     * ���򴴽�������
     * ���أ����ڵ�
     */
    public TreeNode<T>  creatBinaryPre(LinkedList<T> treeData)
    {
        TreeNode<T> root=null;
        T data=treeData.removeFirst();
        if (data!=null) 
        {
            root=new TreeNode<T>(data, null, null);
            root.left=creatBinaryPre(treeData);
            root.right=creatBinaryPre(treeData);
        }
        return root;
    }
    /*
     * ����������������ݹ飩
     */
    public void PrintBinaryTreePreRecur(TreeNode<T> root)
    {
        if (root!=null) 
        {
            System.out.print(root.data);
            PrintBinaryTreePreRecur(root.left);
            PrintBinaryTreePreRecur(root.right);
        }
    }
    /*
     * ����������������ݹ飩
     */
    static ArrayList<Character> list = new ArrayList<Character>();
    public static void BinaryTreeMidRecur(TreeNode root)
    {
        if (root!=null) 
        {
            BinaryTreeMidRecur(root.left);
            System.out.print(root.data);
            list.add((Character) root.data);
            BinaryTreeMidRecur(root.right);
        }
    }
    public void PrintBinaryTreeMidRecur(TreeNode<T> root)
    {
        if (root!=null) 
        {
            PrintBinaryTreeMidRecur(root.left);
            System.out.print(root.data);
            PrintBinaryTreeMidRecur(root.right);
        }
    }
    /*
     * ����������������ݹ飩
     */
    public void PrintBinaryTreeBacRecur(TreeNode<T> root)
    {
        if (root!=null) 
        {
            PrintBinaryTreeBacRecur(root.left);
            PrintBinaryTreeBacRecur(root.right);
            System.out.print(root.data);
        }
    }
    /*
     * ����������������ǵݹ飩
     * ˼·����������ڵ�T����������ڵ㲢ѹ��ջ�У�Ȼ����ʽڵ����������
     *      ��������������ȡ��ջ���Ľڵ�T�����������T��������
     */
    public void PrintBinaryTreePreUnrecur(TreeNode<T> root)
    {
        TreeNode<T> p=root;//pΪ��ǰ�ڵ�
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();
        //ջ��Ϊ��ʱ������p��Ϊ��ʱѭ��
        while(p!=null || !stack.isEmpty())
        {
            //��ǰ�ڵ㲻Ϊ�ա����ʲ�ѹ��ջ�С�������ǰ�ڵ㸳ֵΪ�����
            if (p!=null) 
            {
                stack.push(p);
                System.out.print(p.data);
                p=p.left;
            }
            //��ǰ�ڵ�Ϊ�գ�
            //  1����pָ��������ʱ����ʱջ��Ԫ�ر�Ȼ�����ĸ��ڵ�
            //  2����pָ����Ҷ���ʱ����ʱջ��Ԫ�ر�Ȼ������үү�ڵ�
            //ȡ��ջ��Ԫ�أ���ֵΪright
            else
            {
                p=stack.pop();
                p=p.right;
            }
        }
    }
    /*
     * ����������������ǵݹ飩
     * 
     * ˼·���Ƚ�T��ջ������������������������������ʱ��ջ��Ԫ��ӦΪT��
     *       ��ջ������T->data�����������T����������  
     */
    public void PrintBinaryTreeMidUnrecur(TreeNode<T> root)
    {
        TreeNode<T> p=root;//pΪ��ǰ�ڵ�
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();

        //ջ��Ϊ��ʱ������p��Ϊ��ʱѭ��
        while(p!=null || !stack.isEmpty())
        {
            //��ǰ�ڵ㲻Ϊ�ա�ѹ��ջ�С�������ǰ�ڵ㸳ֵΪ�����
            if (p!=null) 
            {
                stack.push(p);
                p=p.left;
            }
            //��ǰ�ڵ�Ϊ�գ�
            //  1����pָ��������ʱ����ʱջ��Ԫ�ر�Ȼ�����ĸ��ڵ�
            //  2����pָ����Ҷ���ʱ����ʱջ��Ԫ�ر�Ȼ������үү�ڵ�
            //ȡ��������ջ��Ԫ�أ���ֵΪright
            else
            {
                p=stack.pop();
                System.out.print(p.data);
                p=p.right;
            }
        }
    }
    /*
     * ����������������ǵݹ飩
     *  
     */
    public void PrintBinaryTreeBacUnrecur(TreeNode<T> root)
    {
        class NodeFlag<T>
        {
            TreeNode<T> node;
            char tag;
            public NodeFlag(TreeNode<T> node, char tag) {
                super();
                this.node = node;
                this.tag = tag;
            }
        }
        LinkedList<NodeFlag<T>> stack=new LinkedList<NodeFlag<T>>();
        TreeNode<T> p=root;
        NodeFlag<T> bt;
        //ջ���ջ���p����ʱѭ��  
        while(p!=null || !stack.isEmpty())
        {
            //����������
            while(p!=null)
            {
                bt=new NodeFlag(p, 'L');
                stack.push(bt);
                p=p.left;
            }
            //��������������Ϸ��ʸ��ڵ� 
            while(!stack.isEmpty() && stack.getFirst().tag=='R')
            {
                bt=stack.pop();
                System.out.print(bt.node.data);
            }
            //����������
            if (!stack.isEmpty()) 
            {
                bt=stack.peek();
                bt.tag='R';
                p=bt.node;
                p=p.right;
            }
        }
    }
    /*
     * ��α������������ǵݹ飩   
     */
    public void PrintBinaryTreeLayerUnrecur(TreeNode<T> root)
    {
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        TreeNode<T> p;
        queue.push(root);
        while(!queue.isEmpty())
        {
            p=queue.removeFirst();
            System.out.print(p.data);
            if (p.left!=null)
                queue.addLast(p.left);
            if (p.right!=null)
                queue.addLast(p.right);
        }
    }
}
 class TreeNode<T>
{
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

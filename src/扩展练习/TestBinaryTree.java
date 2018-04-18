package ��չ��ϰ;

import java.util.LinkedList;
/*
 * ���Զ�������  ����������
 * �������ṹ����
 *            A
 *       B         C
 *    D     E   F     G
 *  H   I        J 
 */
public class TestBinaryTree 
{
    public static void main(String[] args) 
    {
        BinaryTree<Character> binaryTree=new BinaryTree<Character>();

        //����ABDH##I##E##CF#J##G##��#��null���棩
        LinkedList<Character> tree=new LinkedList<Character>();
        tree.add('A');tree.add('B');tree.add('D');
        tree.add('H');tree.add(null);tree.add(null);
        tree.add('I');tree.add(null);tree.add(null);
        tree.add('E');tree.add(null);tree.add(null);
        tree.add('C');tree.add('F');tree.add(null);
        tree.add('J');tree.add(null);tree.add(null);
        tree.add('G');tree.add(null);tree.add(null);

        TreeNode<Character> root=binaryTree.creatBinaryPre(tree);

        //����������ݹ飩
        binaryTree.PrintBinaryTreePreRecur(root);System.out.println();
        //����������ݹ飩
        binaryTree.PrintBinaryTreeMidRecur(root);System.out.println();
        //����������ݹ飩
        binaryTree.PrintBinaryTreeBacRecur(root);System.out.println();


        //����������ǵݹ飩
        binaryTree.PrintBinaryTreePreUnrecur(root);System.out.println();
        //����������ǵݹ飩
        binaryTree.PrintBinaryTreeMidUnrecur(root);System.out.println();
        //����������ǵݹ飩
        binaryTree.PrintBinaryTreeBacUnrecur(root);System.out.println();
        //��α������ǵݹ飩
        binaryTree.PrintBinaryTreeLayerUnrecur(root);System.out.println();

        System.out.println(BinaryTree.list);
        BinaryTree.BinaryTreeMidRecur(root);
        System.out.println(BinaryTree.list);

    }
}

package ��ָoffer;

import java.util.Stack;

/**
 * 
 *2018-4-2����04:36:24
 * @author moujianming
 * ʵ�ֹ��ܣ����������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 *
 */
public class Test20_ջ��ѹ��_�������� {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      boolean result = false;
	      int j =0;
	      Stack<Integer> stack = new Stack<Integer>();
	      for(int i=0;i<popA.length;i++)
	      {
	    	  stack.push(pushA[i]);
	    	  while(!stack.empty()&&stack.peek()==popA[j])
	    	  {
	    		  stack.pop();
	    		  j++;
	    	  }
	      }
	      result = j==popA.length?true:false;
	      return result;
    }
	public static void main(String[] args) {
		/*int a =0;
		Integer b =0;
		System.out.println(b.equals(a));*/
		int[] a = {1,2,3,4,5};
		int[] b = {4,5,3,2,1};
		Test20_ջ��ѹ��_�������� t = new Test20_ջ��ѹ��_��������();
		System.out.println(t.IsPopOrder(a, b));
		
	}
}

	package ��ָoffer;

import java.util.Iterator;
import java.util.Stack;

/**
 * 
 *2018-4-2����04:09:50
 * @author moujianming
 * ʵ�ֹ��ܣ�����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 *
 */
public class Test19_����min������ջ {
	 
	   Stack<Integer> stack = new Stack<Integer>();
	
	    public void push(int node) {
	        stack.push(node);
	    }
	    
	    public void pop() {
	        stack.pop();
	    }
	    
	    public int top() {
	        return stack.lastElement();
	    }
	    
	    public int min() {
	    	int result= 0;
	    	 result = stack.firstElement();
	        Iterator<Integer> it = stack.iterator();
	        while(it.hasNext())
	        {
	        	result = Math.min(it.next(), result);
	        }
	        return result;
	    }
	public static void main(String[] args) {
		Test19_����min������ջ t = new Test19_����min������ջ();
		t.push(3);
		System.out.println(t.min());
		t.push(4);
		System.out.println(t.min());
		t.push(2);
		System.out.println(t.min());
		t.push(3);
		System.out.println(t.min());
		t.pop();
		System.out.println(t.min());
		t.pop();
		System.out.println(t.min());
		t.pop();
		System.out.println(t.min());
		t.push(0);
		System.out.println(t.min());
	}
}

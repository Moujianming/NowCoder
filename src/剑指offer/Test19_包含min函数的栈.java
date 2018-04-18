	package 剑指offer;

import java.util.Iterator;
import java.util.Stack;

/**
 * 
 *2018-4-2下午04:09:50
 * @author moujianming
 * 实现功能：定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 *
 */
public class Test19_包含min函数的栈 {
	 
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
		Test19_包含min函数的栈 t = new Test19_包含min函数的栈();
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

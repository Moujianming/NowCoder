package ��ָoffer;

import java.util.Stack;

/**
 * 
 *2018-3-30����08:54:26
 * @author moujianming
 * ʵ�ֹ��ܣ�������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 *
 */
public class Test4_������ջʵ�ֶ��� {


	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack2.push(node);
    }
    public int pop() {
		while(stack2.size()!=0)
		{
			Integer pop = stack2.pop();
			stack1.push(pop);
		}
		Integer result = stack1.pop();
		while(stack1.size()!=0)
		{
			Integer pop = stack1.pop();
			stack2.push(pop);
		}
    	return result;      
    }
	public static void main(String[] args) {
		
	}
}

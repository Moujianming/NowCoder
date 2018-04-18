package 剑指offer;

import java.util.Stack;

/**
 * 
 *2018-3-30下午08:54:26
 * @author moujianming
 * 实现功能：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 */
public class Test4_用两个栈实现队列 {


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

package 剑指offer;

import java.util.Stack;

/**
 * 
 *2018-4-2下午04:36:24
 * @author moujianming
 * 实现功能：输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 *
 */
public class Test20_栈的压入_弹出序列 {
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
		Test20_栈的压入_弹出序列 t = new Test20_栈的压入_弹出序列();
		System.out.println(t.IsPopOrder(a, b));
		
	}
}

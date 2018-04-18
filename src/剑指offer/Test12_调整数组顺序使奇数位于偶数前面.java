package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *2018-3-31下午02:08:50
 * @author moujianming
 * 实现功能：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 */
public class Test12_调整数组顺序使奇数位于偶数前面 {


	public void reOrderArray(int [] array) {
        //先找到奇数的个数
		if(array.length>1)
		{
			int n = 0;
			for (int i : array) {
				if(i%2==1)
					n++;
			}
			List<Integer> head = new ArrayList<Integer>();
		
			List<Integer> tail = new ArrayList<Integer>();
			//System.out.println(head.toArray());
			for (int i : array) {
				if(i%2==1)
				{
					head.add(i);
				}else
				{
					tail.add(i);
				}
			}
			for(int i = 0;i<array.length;i++)
			{
				if(i<head.size())
				{
					array[i] = head.get(i);
				}
				if(i>=head.size())
				{
					array[i] = tail.get(i-n);
				}
			}
		}
    }
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8};
		new Test12_调整数组顺序使奇数位于偶数前面().reOrderArray(array);
	}
}
/**
 * 可以利用冒泡排序的思想,将偶强奇后的调换位置即可
 * */

package 剑指offer;

import java.util.Arrays;

/**
 * 
 * @author:moujianming
 *2018年4月9日:上午11:40:11
 * 问题描述:数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Test27 {

	public int MoreThanHalfNum_Solution(int [] array) {
        int result = 0;
        //
        int max =array.length/2+1;
        int count=  1;
        Arrays.sort(array);
        for(int i = 0;i<array.length-1;i++)
        {
        	if(array[i]==array[i+1])
        	{
        		count++;
        		if(count==max)
        		{
        			result = array[i];
        			break;
        		}
        	}else
        	{
        		count=1;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int[] a = {1,2,3,2,2,2,5,4,2};
		new Test27().MoreThanHalfNum_Solution(a);
	}
}
//用时15分钟

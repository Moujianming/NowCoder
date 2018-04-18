package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author:moujianming
 *2018年4月9日:下午2:01:26
 * 问题描述:输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Test28_求数组最小k个值 {
	 public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	        Arrays.sort(input);
	        ArrayList<Integer> result = new ArrayList<>();
	        if(k>input.length)
	        	return result;
	        for(int i=0;i<k;i++)
	        {
	        	result.add(input[i]);
	        }
	        return result;
	    }
	public static void main(String[] args) {
		
	}
}
//用时10分钟

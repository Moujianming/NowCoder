package ��ָoffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author:moujianming
 *2018��4��9��:����2:01:26
 * ��������:����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 */
public class Test28_��������Сk��ֵ {
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
//��ʱ10����

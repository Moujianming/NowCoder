package ��ָoffer;

import java.util.Arrays;

/**
 * 
 * @author:moujianming
 *2018��4��9��:����11:40:11
 * ��������:��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬
 * ���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
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
//��ʱ15����

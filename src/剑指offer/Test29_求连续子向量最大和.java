package ��ָoffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author:moujianming
 *2018��4��9��:����2:13:34
 * ��������:HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 * ��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
 * ������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��᲻�ᱻ������ס��(�������ĳ���������1)
 */
public class Test29_���������������� {

	public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==1)
        	return array[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0;i<array.length;i++)
        {
        	if(array[i]+result>0)
        	{
        		result+=array[i];
        		map.put(result, i);
        	}else
        	{
        		result=0;
        	}
        }
        if(map.size()==0)
        {
        	Arrays.sort(array);
        	result = array[array.length-1];
        	return result;
        }
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext())
        {
        	result = Math.max(result, it.next());
        }
       // System.out.println(result);
        return result;
       
        
    }
	public static void main(String[] args) {
		int[] a =  {6,-3,-2,7,-15,1,2,2};
		new Test29_����������������().FindGreatestSumOfSubArray(a);
	}
}
//��ʱ25����
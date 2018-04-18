package 剑指offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author:moujianming
 *2018年4月9日:下午2:13:34
 * 问题描述:HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Test29_求连续子向量最大和 {

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
		new Test29_求连续子向量最大和().FindGreatestSumOfSubArray(a);
	}
}
//用时25分钟
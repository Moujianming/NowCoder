package ��ָoffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *2018-3-31����02:08:50
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 *
 */
public class Test12_��������˳��ʹ����λ��ż��ǰ�� {


	public void reOrderArray(int [] array) {
        //���ҵ������ĸ���
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
		new Test12_��������˳��ʹ����λ��ż��ǰ��().reOrderArray(array);
	}
}
/**
 * ��������ð�������˼��,��żǿ���ĵ���λ�ü���
 * */

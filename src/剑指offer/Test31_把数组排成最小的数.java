package ��ָoffer;

import java.util.Arrays;

/**
 * 
 * @author:moujianming
 *2018��4��9��:����3:07:12
 * ��������:����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
 */
public class Test31_�������ų���С���� {
	public String PrintMinNumber(int [] numbers) {

		String result  = "";
		if(numbers.length==0)
			return result;
		if(numbers.length==1)
			return ""+numbers[0];
		for(int i = 0;i<numbers.length;i++)
		{
			for(int j =i+1;j<numbers.length;j++)
			{
				if(!swap(numbers[i],numbers[j]))
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		//System.out.println(Arrays.toString(numbers));
		for(int i = 0;i<numbers.length;i++)
		{
			result+=numbers[i];
		}
		//System.out.println(result);
		return result;
    }
	public boolean swap(int a,int b)//a<b����true
	{
		int count_a = 0;
		int count_b = 0;
		int A = a;
		int B = b;
		while(a/10!=0)
		{
			
			count_a++;
			a =a/10;
		}
		while(b/10!=0)
		{
			count_b++;
			b =b/10;
		}
		if(count_a==count_b&&count_a==0)
			return a<b;
		
		int step = Math.abs(count_a-count_b);
		while(step>0)
		{
			if(A>B)
			{
				B = B*10+b;
			}else
			{
				A=A*10+a;
			}
			step--;
		}
		return A<B;
	}
	public static void main(String[] args) {
		
		int[] a = {3,32,321};
		new Test31_�������ų���С����().PrintMinNumber(a);
	}
}
//��ʱ30����--�����ñȽ�����д
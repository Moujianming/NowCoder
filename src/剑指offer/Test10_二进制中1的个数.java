package ��ָoffer;
/**
 * 
 *2018-3-31����11:02:34
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 *
 */
public class Test10_��������1�ĸ��� {


	public int NumberOf1(int n) {

		if(n==0)
			return 0;
		int result = 0;
		if(n>0)
		{
			result = GetCount(n);
		}
		if(n<0)
		{
			n = Math.abs(n)-1;
			result = 32 - GetCount(n);
		}
		return result;
	}
	public static int GetCount(int n)
	{
		int result = 0;
		while(n!=0)
		{
			if(n%2==1)
			{
				result++;
				n = (n-1)/2;
			}else
			{
				n = n/2;
			}
			
		}
		return result;	
	}
	
	//2�з���
	public int NumberOf2(int n)
	{
		int result = 0;
		while(n!=0)
		{
			result++;
			n=n&(n-1);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(new Test10_��������1�ĸ���().NumberOf2(-5));
	}
}

package 剑指offer;
/**
 * 
 *2018-3-31上午11:02:34
 * @author moujianming
 * 实现功能：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 */
public class Test10_二进制中1的个数 {


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
	
	//2中方法
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
		System.out.println(new Test10_二进制中1的个数().NumberOf2(-5));
	}
}

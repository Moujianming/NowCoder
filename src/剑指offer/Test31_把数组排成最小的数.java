package 剑指offer;

import java.util.Arrays;

/**
 * 
 * @author:moujianming
 *2018年4月9日:下午3:07:12
 * 问题描述:输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class Test31_把数组排成最小的数 {
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
	public boolean swap(int a,int b)//a<b返回true
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
		new Test31_把数组排成最小的数().PrintMinNumber(a);
	}
}
//用时30分钟--可以用比较器来写
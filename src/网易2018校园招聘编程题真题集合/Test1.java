package 网易2018校园招聘编程题真题集合;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String  nun_str = in.nextLine();
		double num = Double.valueOf(nun_str);
		System.out.println(Test1.GetString(num));
	}
	public static String GetString(double num)
	{
		String result="";
		while(num>2)
		{
			if(num%2==1)
			{
				result = 1+result;
				num = (num-1)/2;
				
			}else
			{
				result = 2+result;
				num = (num-2)/2;
			}
		}
		//num==2?(result=2+result):(result=1+result);
		if(num%2==0)
		{
			result = 2+result;
		}else
		{
			result = 1+result;
		}
			
		
		return result;
	}
}

package 网易2018校园招聘编程题真题集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		
		System.out.println(Test2.GetOppsiteNum(num));
		
	}
	public static int GetOppsiteNum(int num)
	{
		int init= num;
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean mutex = true;
		while(num>9)
		{
			if(num%10==0&&mutex)
			{
				num = num/10;
				continue;
			}
			mutex = false;
			int i =num%10;
			list.add(i);
			num = num/10;	
		}
		list.add(num);
		String s = "";
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
		{
			s=s+iterator.next();
		}
	
		int result=init+Integer.parseInt(s);
		
		
		return result;
	}
}

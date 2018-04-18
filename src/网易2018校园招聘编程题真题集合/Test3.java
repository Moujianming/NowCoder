package 网易2018校园招聘编程题真题集合;


import java.util.Scanner;

public class Test3 {

	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s= in.nextLine().trim();
		System.out.println(Test3.GetStringPiece(s));
		
	}

	public static String GetStringPiece(String s)
	{
		float result =0.00f;
		char m=' ';
		int len=0;
		int total_len=0;
		int count = 0;
		char[] cs = s.toCharArray();
		for(int i = 0;i<cs.length;i++)
		{
			if(m!=cs[i])
			{
				total_len = total_len+len;
				len=1;
				count++;
				m=cs[i];
			}else
			{
				len++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sb1 = new StringBuffer();
		
		
		total_len = total_len+len;
		//count++;
		result =(float)total_len/(float)count;
		String str=""+(int)(result*100);
		//str = str.subSequence(0, str.length()-2)+"."+str.subSequence(str.length()-2, str.length());
		
		return str;//Float.valueOf(String.format("%.2f", result));
		
	}
}

package ��ָoffer;

import java.util.Arrays;

/**
 * 
 * @author moujianming
 *2018��4��11��:����3:18:00
 *����:��һ���ַ���(1<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��
 */
public class Test33_��һ��ֻ����һ�ε��ַ� {
	 public int FirstNotRepeatingChar(String str) {
	       int result = 0;
	       //A-Z-->0-25
	       //a-z-->26-51
	       int[] array = new int[52];
	       for (int i = 0; i < array.length; i++) {
			if(i<=25)
			{
				array[i] = ('A'+i);
			}else {
				array[i] = ('a'+i-26);
			}
		}
		
		char[] cs = str.toCharArray();
		
		//1��ʾ��һ�η���,�ڶ��η��ʸ�Ϊ0,�����������
		int count = 200;
		for (int i = 0; i < cs.length; i++) {
			if(array[Position(cs[i])]==cs[i])
			{
				array[Position(cs[i])] = count;
				count++;
			}else
			{
				array[Position(cs[i])]=0;
			}
		}
		//System.out.println(Arrays.toString(array));
		int min = 10000;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>=200)
			{
			   result = min>array[i]?i:result;
			   min = array[result];
			}
		}
		if(result<=25)
			{
			result = str.indexOf(result+'A');
			}else
			{
		   result = str.indexOf(result+'a'-26);
			}
		System.out.println(result);
		 return result;
	    }
	 public static int Position(char c) {
		 int pos = 0;
		 pos=c-'a'>=0?(c-'a'+26):c-'A';
		 return pos;
	 }
	public static void main(String[] args) {
		//System.out.println('z'-0);
		new Test33_��һ��ֻ����һ�ε��ַ�().FirstNotRepeatingChar("abcabcddrtyuiop");
	}
}

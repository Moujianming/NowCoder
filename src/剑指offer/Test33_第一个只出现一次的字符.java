package 剑指offer;

import java.util.Arrays;

/**
 * 
 * @author moujianming
 *2018年4月11日:下午3:18:00
 *功能:在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class Test33_第一个只出现一次的字符 {
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
		
		//1表示第一次访问,第二次访问改为0,后面依次相加
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
		new Test33_第一个只出现一次的字符().FirstNotRepeatingChar("abcabcddrtyuiop");
	}
}

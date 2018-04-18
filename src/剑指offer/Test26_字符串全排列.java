package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author:moujianming
 *2018年4月8日:下午8:46:01
 * 问题描述:输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Test26_字符串全排列 {/*
	public static HashMap<String, Integer> GetResult(String str)
	{
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		if("".equals(str))
			return map;
		if(str.length()==1)
		{
			map.put(str,str.length());
			return  map;
		}
		if(str.length()==2)
		{
			map.put(str,str.length());
			map.put(new StringBuffer(str).reverse().toString(),str.length());
			return  map;
		}
		HashMap<String, Integer> result = GetResult(str.substring(0, str.length()-1));
		 char[] cr = str.substring(0, str.length()).toCharArray();
	     int len = cr.length;
	      Iterator<String> it = result.keySet().iterator();
	     
	      while(it.hasNext())
	      {
	    	   String s = it.next();
	    	  for (int i = 0; i <=cr.length; i++) {
	    		 StringBuffer sb = new StringBuffer(s);
	    		 if(i==cr.length)
	    		 {
	    			 sb.append(cr[len-1]);
	    			 map.put(sb.toString(), i); 
	    			 break;
	    		 }
	    		 sb.insert(i, cr[len-1]);
	    		
	  			map.put(sb.toString(), i);
	  		}
	    	  
	      }
	      result.clear();
	     return map;
		
	}
	 public ArrayList<String> Permutation(String str) {
	      ArrayList<String> list = new ArrayList<>();
	      HashMap<String, Integer> result = GetResult(str);
	      Iterator<String> t = result.keySet().iterator();
	      while(t.hasNext())
	      {
	    	  list.add(t.next());	
	      }
	      Collections.sort(list, new Comparator<String>() {

			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
	    	  
		});
	      System.out.println(list);
	      return list;
	    }*/
	
		public ArrayList<String> Permutation(String str) {/*
		ArrayList<String> res = new ArrayList<>();
		
		if (str != null && str.length() > 0) {
		char[] seq = str.toCharArray();
		Arrays.sort(seq); //排列
		res.add(String.valueOf(seq)); //先输出一个解
		
		int len = seq.length;
		while (true) {
		int p = len - 1, q;
  // //从后向前找一个seq[p - 1] < seq[p]
		while (p >= 1 && seq[p - 1] >= seq[p]) --p;
		if (p == 0) break; ////已经是“最小”的排列，退出
		//             //  // //从p向后找最后一个比seq[p]大的数
		q = p; --p;
		while (q < len && seq[q] > seq[p]) q++;
		--q;
		//交换这两个位置上的值
		swap(seq, q, p);
		//将p之后的序列倒序排列
		reverse(seq, p + 1);
		res.add(String.valueOf(seq));
		}
		}

		System.out.println(res);
		return res;
		*/
		ArrayList<String > res = new ArrayList<>();

		if(str!=null&&str.length()>0)
		{
			char[] seq = str.toCharArray();
			Arrays.sort(seq);
			res.add(String.valueOf(seq));
			int len = seq.length;
			while(true)
			{
				int k = len-1,q;
				//找到k的位置
				while(k>=1)
				{
					if(seq[k]>seq[k-1])break;
					else {
						k--;
					}
				}
				if(k==0)break;
				q = k-1;
				int begin = k;
				char min = seq[begin];
				for(int i = begin+1;i<len;i++)
				{
					if(min>seq[i]&&seq[i]>seq[q])
					{
						min = seq[i];
						k = i;
					}
				}
				swap(seq, q, k);
				reverse(seq,begin);
				res.add(String.valueOf(seq));
			}
		}
		System.out.println(res);
		return res;
	}
		
		public static void reverse(char[] seq, int start) {
		int len;
		if(seq == null || (len = seq.length) <= start)
		return;
		for (int i = 0; i < ((len - start) >> 1); i++) {
		int p = start + i, q = len - 1 - i;
		if(p != q)
			swap(seq, p, q);		
		}
}
		
		public static void swap(char[] cs, int i, int j) {
		char temp = cs[i];
	     cs[i] = cs[j];
		cs[j] = temp;
		}
	public static void main(String[] args) {
		new Test26_字符串全排列().Permutation("abc");
	}
}
//用时1个半小时

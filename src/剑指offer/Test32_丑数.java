package 剑指offer;

import java.util.Arrays;

/**
 * 
 * @author moujianming
 *2018年4月10日:下午4:33:57
 *功能把只包含因子2、3和5的数称作丑数（Ugly Number）。
 *例如6、8都是丑数，但14不是，因为它包含因子7。 
 *习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Test32_丑数 {
	public int GetUglyNumber_Solution(int index) {
		int result = 1;
		if(index==1)
			return result;
		int i =1 ;
		int j=2;
		while(i<index)
		{
			int num = j;
			while(num%2==0||num%3==0||num%5==0||num==1)
			{
				if(num==1)
				{
					i++;
					System.out.println(j);
					break;
				}
				if(num%2==0)num/=2;
				if(num%3==0)num/=3;
				if(num%5==0)num/=5;
			}
			j++;
		}
		
        return j;
    }
	//方法2
	final int d[] = { 2, 3, 5 };
	public int GetUglyNumber_SolutionII(int index) {
		if(index == 0) return 0;
		int a[] = new int[index];
		a[0] = 1;
		int p[] = new int[] { 0, 0, 0 };
		int num[] = new int[] { 2, 3, 5 };
		int cur = 1;
	
			while (cur < index) {
				int m = finMin(num[0], num[1], num[2]);
				if (a[cur - 1] < num[m])
				a[cur++] = num[m];
				p[m] += 1;
				num[m] = a[p[m]] * d[m];
				}
			System.out.println(Arrays.toString(a));
			return a[index - 1];
	     }
	
		private int finMin(int num2, int num3, int num5) {
		int min = Math.min(num2, Math.min(num3, num5));
		return min == num2 ? 0 : min == num3 ? 1 : 2;
		}
	public static void main(String[] args) {
		new Test32_丑数().GetUglyNumber_SolutionII(20);
	}
}

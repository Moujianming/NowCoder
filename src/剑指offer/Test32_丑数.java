package ��ָoffer;

import java.util.Arrays;

/**
 * 
 * @author moujianming
 *2018��4��10��:����4:33:57
 *���ܰ�ֻ��������2��3��5��������������Ugly Number����
 *����6��8���ǳ�������14���ǣ���Ϊ����������7�� 
 *ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */
public class Test32_���� {
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
	//����2
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
		new Test32_����().GetUglyNumber_SolutionII(20);
	}
}

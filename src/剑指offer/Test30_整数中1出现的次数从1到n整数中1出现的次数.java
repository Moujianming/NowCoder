package ��ָoffer;

/**
 * @author:moujianming
 *2018��4��9��:����2:43:15
 * ��������:���1~13��������1���ֵĴ���,
 * �����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
 */
public class Test30_������1���ֵĴ�����1��n������1���ֵĴ��� {
	 public int NumberOf1Between1AndN_Solution(int n) {
		    int result = 0;
		 for(int i = 1;i<=n;i++)
		 {
			 if(Judge(i)>0)
				 {
				 result+=Judge(i);
				 //System.out.println(i);
				 }
		 }
		 return result;
	    }
	 public int Judge(int n)
	 {
		 int res = 0;
		 while(n/10!=0)
		 {
			 if(n%10==1)res++;
			 n = n/10;	 
		 }
		 if(n%10==1)res++;
		 return res;
	 }
	public static void main(String[] args) {
		System.out.println(new Test30_������1���ֵĴ�����1��n������1���ֵĴ���().NumberOf1Between1AndN_Solution(1));
	}
}
//��ʱ20����

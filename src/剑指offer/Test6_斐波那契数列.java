package ��ָoffer;


/**
 * 
 *2018-3-30����09:31:37
 * @author moujianming
 * ʵ�ֹ��ܣ���Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
            n<=39
 *
 */
public class Test6_쳲��������� {


	/*public static  int F(int n) {	
		//n = n-1;
		if(n==0)
			return 1;
		if(n==1)
		   return 1;
		int result = 0;
		if(n>=2)
		{
			result =  F(n-2)+F(n-1);
		}
		return result;
    }
	 public int Fibonacci(int n) {

		 return F(n-1);
	    }*/


		public int Fibonacci(int n) {
		        int preNum=1;
		        int prePreNum=0;
		        int result=0;
		        if(n==0)
		            return 0;
		        if(n==1)
		            return 1;
		        for(int i=2;i<=n;i++){
		            result=preNum+prePreNum;
		            prePreNum=preNum;
		            preNum=result;
		        }
		        return result;

		    }
	public static void main(String[] args) {
		System.out.println(new Test6_쳲���������().Fibonacci(2));
		
	}
}

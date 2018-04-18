package 剑指offer;


/**
 * 
 *2018-3-30下午09:31:37
 * @author moujianming
 * 实现功能：大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
            n<=39
 *
 */
public class Test6_斐波那契数列 {


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
		System.out.println(new Test6_斐波那契数列().Fibonacci(2));
		
	}
}

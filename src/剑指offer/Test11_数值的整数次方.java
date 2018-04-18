package 剑指offer;
/**
 * 
 *2018-3-31上午11:31:14
 * @author moujianming
 * 实现功能：给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 *
 */
public class Test11_数值的整数次方 {


	public double Power(double base, int exponent) {
        if(exponent==0)
        	return 1;
        if(exponent==1)
        	return base;
        int n =Math.abs(exponent);
        double result = Power(base,n>>1);
        result = result*result;
        if((n&1)==1)
        {
        	result*=base;
        }
        if(exponent<0)
        {
        	result =1/result;
        }
        return result;
	  }
	public static void main(String[] args) {
		
	}
}

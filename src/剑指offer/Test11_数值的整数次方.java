package ��ָoffer;
/**
 * 
 *2018-3-31����11:31:14
 * @author moujianming
 * ʵ�ֹ��ܣ�����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * 
 *
 */
public class Test11_��ֵ�������η� {


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

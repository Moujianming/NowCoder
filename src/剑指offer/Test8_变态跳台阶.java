package 剑指offer;
/**
 * 
 *2018-3-31上午09:59:36
 * @author moujianming
 * 实现功能：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 */
public class Test8_变态跳台阶 {



	public int JumpFloorII(int target) {
      if(target<=0)
    	  return 0;
      if(target ==1)
          return 1;
      if(target==2)
    	  return 2;
      int result = 0;
      if(target>=3)
      {
    	  for(int i = target;i>=1;i--)
    	  {
    		  result = JumpFloorII(target-i)+result;
    	  }
      }
      return result+1;
    }
	
	public static void main(String[] args) {
		System.out.println(new Test8_变态跳台阶().JumpFloorII(3));
	}
}

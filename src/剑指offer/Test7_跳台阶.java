package 剑指offer;
/**
 * 
 *2018-3-31上午09:40:52
 * @author moujianming
 * 实现功能：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 */
public class Test7_跳台阶 {


	  public int JumpFloor(int target) {

		  if(target<=0)
			  try {
				throw new Exception("target 不满足条件");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		  
		  if(target==1)
			  return 1;
		  if(target==2)
			  return 2;
		  int result = 0;
		  if(target>2)
		  {
			  result = JumpFloor(target-1)+JumpFloor(target-2);
		  }
		  return result;
	    }
	public static void main(String[] args) {
		System.out.println(new Test7_跳台阶().JumpFloor(3));
	}
}

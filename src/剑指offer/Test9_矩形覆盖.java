package 剑指offer;
/**
 * 
 *2018-3-31上午10:44:07
 * @author moujianming
 * 实现功能：我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 */
public class Test9_矩形覆盖 {


	public int RectCover(int target) {

		if(target==1)
			return 1;
		if(target==2)
			return 2;
		int result = 0;
		if(target>2)
		{
			result = RectCover(target-1)+RectCover(target-2);
		}
		return result;
    }
	public static void main(String[] args) {
		
	}
}

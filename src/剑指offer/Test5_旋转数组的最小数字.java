package 剑指offer;
/**
 * 
 *2018-3-30下午09:09:11
 * @author moujianming
 * 实现功能：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *  输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *   例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
 *   NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
 *
 */
public class Test5_旋转数组的最小数字 {


	public int minNumberInRotateArray(int [] array) {
	    if(array.length==0)
	    	return 0;
	    if(array.length==1)
	    	return array[0];
	    int min = array[0];
	    int i = 0;
	    while(i<array.length-1)
	    {
	    	int emo = array[0];
	    	System.arraycopy(array, 1, array, 0, array.length-1);
	    	array[array.length-1] = emo;
	    	if(array[0]<min)
	    	{
	    		min = array[0];
	    	}
	    	i++;
	    }
	    
	    return min;
    }
	
	public static void main(String[] args) {
		int[] array = {3,4,5,1,2};
		System.out.println(new Test5_旋转数组的最小数字().minNumberInRotateArray(array));
	}
	/**
	 * 利用二分查找的思想解答此题比较简单
	 */
}

package ��ָoffer;
/**
 * 
 *2018-3-30����09:09:11
 * @author moujianming
 * ʵ�ֹ��ܣ���һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 *  ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 *   ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
 *   NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0
 *
 */
public class Test5_��ת�������С���� {


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
		System.out.println(new Test5_��ת�������С����().minNumberInRotateArray(array));
	}
	/**
	 * ���ö��ֲ��ҵ�˼�������Ƚϼ�
	 */
}

package ��ָoffer;
/**
 * 
 *2018-3-31����10:44:07
 * @author moujianming
 * ʵ�ֹ��ܣ����ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 *
 */
public class Test9_���θ��� {


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

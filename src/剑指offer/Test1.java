package ��ָoffer;
/**
 * 
��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class Test1 {


	public String replaceSpace(StringBuffer str) {
    	StringBuffer result= new StringBuffer();
    	
    	char[] cs = str.toString().toCharArray();
    	for (char c : cs) {
			if(c==' ')
			{
				result.append("%20");
			}else
			{
				result.append(c);
			}
		}  	 	
    	return result.toString();
    	
    }
	public static void main(String[] args) {
		System.out.println(new Test1().replaceSpace(new StringBuffer("we are happy")));
	}
}

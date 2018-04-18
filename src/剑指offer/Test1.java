package 剑指offer;
/**
 * 
请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
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

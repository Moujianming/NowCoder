package ��չ��ϰ;
class Super{
	static String greeting()
	{
		return "super";
	}
   String name()
   {
	   return "super_name";
   }
}
class Sub extends Super
{
	static String greeting()
	{
		return "sub";
	}
	String name()
	{
		return "sub_name";
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		Super s = new Sub();
		System.out.println(s.greeting()+ " "+s.name());//��ʵ�����������ǣ���̬���������ء�
	}
	
}

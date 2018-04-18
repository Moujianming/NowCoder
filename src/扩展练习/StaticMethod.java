package 扩展练习;
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
		System.out.println(s.greeting()+ " "+s.name());//“实例方法被覆盖，静态方法被隐藏”
	}
	
}

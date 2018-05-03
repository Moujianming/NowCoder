package 扩展练习;

import java.sql.ResultSet;

public class B {

	public static B t1 = new B();
	public static B t2 = new B();
	{
		System.out.println("构造快");
	}
	static 
	{
		System.out.println("静态块");
	}
	public static void main(String[] args) {
	new B();
	//ResultSet
	}

}

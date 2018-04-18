package 扩展练习;

import java.util.ArrayList;
import java.util.Iterator;

public class 快速失败和安全失败 {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(1);list.add(8);list.add(2);list.add(3);list.add(83);list.add(3);list.add(33);list.add(0);
	System.out.println(list);
	
	Iterator<Integer> iterator = list.iterator();
	int i =0;
	while(iterator.hasNext())
	{
		if(i++ == 4)
		{
			list.add(1);list.add(8);list.add(2);list.add(3);list.add(83);list.add(3);list.add(33);list.add(0);
			list.add(1);list.add(8);list.add(2);list.add(3);list.add(83);list.add(3);list.add(33);list.add(0);
		}
		System.out.println(iterator.next());
	}
}
}

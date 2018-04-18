package 扩展练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class comparable与comparator区别 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(8);list.add(2);list.add(3);list.add(83);list.add(3);list.add(33);list.add(0);
		Collections.sort(list, new Comparator<Integer>() {

			
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}					
		});
		System.out.println(list);
		
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
			System.out.println(listIterator.previous());
		}
	}
}

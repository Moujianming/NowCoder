package 扩展练习;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashSetAndTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);hs.add(3);hs.add(2);hs.add(5);hs.add(99);hs.add(98);
		
		System.out.println(hs);
		System.out.println(99%16);
		System.out.println("------------------");
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);ts.add(3);ts.add(2);ts.add(5);ts.add(99);ts.add(98);
		System.out.println(ts);
		System.out.println("--------------------");
		TreeMap<Integer,Integer> tm = new TreeMap<>();
		tm.put(1, 1);tm.put(2, 1);tm.put(3, 2);tm.put(5, 11);tm.put(4, 1);//按照key值来进行排序的
		System.out.println(tm);
		
	}
	
}

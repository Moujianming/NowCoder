package À©Õ¹Á·Ï°;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//package À©Õ¹Á·Ï°;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TestInteger {

	/* static final int hash(Object key) {
	        int h;
	        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	    }*/
	public static void main(String[] args) {
		/*Integer i =10;
		Integer j =10;
		System.out.println(i==j);
		System.out.println(i.hashCode()+" "+j.hashCode());
		Integer m = new Integer(10);
		Integer n = new Integer(10);
		System.out.println(m==n);
		System.out.println(m.hashCode()+" "+n.hashCode());
		System.out.println(m.intValue()==n.intValue());
		System.out.println(m.equals(n));*/
		//java.util.HashMap<K, V>
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(9, 1);
		map.get(9).hashCode();
		map.put(null,1);
		//map.put(null, 2);
		map.put(3, 3);
		map.put(11, 11);
		map.put(7, 20);
		map.put(22, 2);
		//map.compute(key, remappingFunction)
		/*Collections.sort(map, new Comparator<T>() {
		});*/
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer>  o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		System.out.println(map);
		for(Map.Entry<Integer,Integer> mapping:list){ 
            System.out.println(mapping.getKey()+":"+mapping.getValue()); 
       } 
		byte b1=1,b2=2,b3,b6,b8;
		final byte b4=4,b5=6,b7;
		b3=(byte)(b1+b2);  //Óï¾ä1
		b6=b4+b5;   // Óï¾ä2
		//System.out.println(b1);
		//b8=(b1+b4); //Óï¾ä3
		//b7=(b2+b5);  //Óï¾ä4
		//System.out.println(b3+b6);
		/**
		 * 
		 */
		PriorityQueue< Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(2);
		pq.add(5);
		pq.add(0);
		System.out.println(pq);
		System.out.println(pq.poll());
		pq.add(9);
		System.out.println(pq);
		//String str = 100;
	}
}

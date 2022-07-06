package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list_program {
	public static void main(String[] args) {
		
		List <Object> r  = new ArrayList<>();
		r.add(10);
		r.add(15);
		r.add(25);
		r.add(35);
		r.add(50);
		System.out.println(r);
		r.add(4, 29);
		System.out.println(r);
		 int size = r.size();
		System.out.println(size);
		int indexOf = r.indexOf(25);
		System.out.println(indexOf);
		 boolean contains = r.contains(200);
         System.out.println(contains);
          r.set(3, 26);
         System.out.println(r);
         r.remove(2);
         System.out.println(r);
          List<Object> r1 = new LinkedList<>();
        r1.add(35); 
        r1.add(50);
        r1.add(60);
        r1.add(70);
        r1.add(80);
        System.out.println(r1);
        r1.addAll(r);
        System.out.println(r1);
         r1.retainAll(r);
         System.out.println(r1);// want to command for console
     
         r1.removeAll(r);
        System.out.println(r1);
         r1.clear();
         System.out.println(r1);
         }

}

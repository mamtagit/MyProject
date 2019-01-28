package practice;

import java.util.HashMap;
import java.util.Map;

public class School {

	public static  void main(String[] args) {
		Map<Integer,String> sc=new HashMap<>();
		sc.put(1,"java");
		sc.put(2,"psql");
		sc.put(3,"oracle");
		sc.put(4, "java");
		String a=sc.get(1);
		System.out.println(a);
		
		
		
	}

}

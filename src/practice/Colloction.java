package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Colloction {

	public static void main(String[] args) {
		Map<Integer,String> emp=new HashMap<Integer,String>();
		emp.put(1,"java");
		emp.put(2,"oracle");
		emp.put(3,"sql");
		emp.put(5,"tezting");
		emp.put(4,"eclipse");
		emp.put(4,"java");
		Set<Integer> s=emp.keySet();
		System.out.println(s);
	}
	}
		


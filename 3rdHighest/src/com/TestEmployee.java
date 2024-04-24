package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//3rd highest salary ---- 2ways
public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "abc", 200));
		empList.add(new Employee(2, "xyz", 500));
		empList.add(new Employee(3, "gth", 800));
		empList.add(new Employee(4, "mno", 1800));
	
	
		// 1st way -- 3rd highest salary
		    Optional<Employee> findFirst = 
		    		empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
		    		
		    
		    System.out.println(findFirst);
		    		
		 // 2nd way ----   3rd highest salary  
		    //  empList.stream().sorted( (e1,e2)->e2.getSalary()-e1.getSalary() ).skip(2).findFirst().get();
		    		
		//		System.out.println(empSal);
			
	}
}

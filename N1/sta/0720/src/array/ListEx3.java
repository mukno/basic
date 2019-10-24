package array;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
	
	public static void main(String[] args) {
		//Student객체를 담을 Arraylist생성
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("ddd","dddd","ddd"));
		list.add(new Student("ddd","dddd","ddd"));
		list.add(new Student("ddd","dddd","ddd"));
		list.add(new Student("ddd","dddd","ddd"));
		list.add(new Student("ddd","dddd","ddd"));
		list.add(new Student("ddd","dddd","ddd"));

		
		for(Student st:list) {
			System.out.println(st);
			
		}

		
		
	}
}

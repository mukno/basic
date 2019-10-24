package array;

import java.util.ArrayList;
import java.util.List;

import after.Child;
import after.Parent;

public class ListEx4 {
	

	public static void main(String[] args) {
		List<Parent> list=new ArrayList<Parent>();
		
		list.add(new Parent());
		list.add(new Child());
	}

}

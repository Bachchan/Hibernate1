package model;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.setsFirstName("aaaa");
		st1.setSID(101);
		
		Student st2 = new Student();
		st2.setsFirstName("aaaa");
		st2.setSID(101);
		
		Student st3 = new Student();
		st3.setsFirstName("aaaa");
		st3.setSID(101);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st3);
		list.add(st2);
		list.add(st1);
		for(Student st : list)
		{
			System.out.println(st.getsFirstName());
		}
		
	}

}


public class createStudents {
	
	public static void main(String[] args) {
		System.out.println(Student.count);
		//Student s1 = new Student();
		//Student s2 = new Student();
				
	/*	System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.roll);
		System.out.println(s1.marks); */
		
	/*	s1.name= "Ishani";
		s1.roll = 12;
		s1.gender= 'f';
		s1.marks = 50; */
		
		Student s1 = new Student("jane",'f', 15, 88);
		System.out.println(Student.count);
		Student s2 = new Student();
		System.out.println(Student.count);
		
		
	/*	System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.roll);
		System.out.println(s1.marks); */
		
		//System.out.println(s1.getDetails());
		//System.out.println(s1.getgrade());
		//System.out.println(s2.getDetails());
		
		Student s4 = Student.newInstance("ishani",'f', 15,55);	
		System.out.println(s4.getDetails());
		
		
	}

}

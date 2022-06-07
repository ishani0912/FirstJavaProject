
public class StudentObject {
	
	public static void main(String[] args) {
		Student[] s = new Student[3];
		
		s[0] = new Student("Meet",'M',10,45);
		s[1] = new Student("Ishani ",'F',11,55);
		s[2] = new Student("Reena",'F',12,65);
		
		for(int i=0; i<s.length;i++)
		{
			System.out.println("Name:" + s[i].name);
			System.out.println("Gender:" + s[i].gender);
			System.out.println();
		}
	}

}

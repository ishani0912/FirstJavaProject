
public class Student {
	
	//instance attributes
	String name;
	char gender;
	int roll;
	float marks;
	
	static int count; //class object attribute
	
	String getDetails()    //internally: even if no parameter is defined, keyword this. (String getDetails(Student this)
	{
		//return ("name:" + this.name + "\n" + "gender:" + this.gender + "\n" + "roll no:"+ this.roll + "\n"+"marks:" + this.marks+"\n");
		
		//String format()
		return String.format("name:%s\nGender:%s\nRollNo:%s\nMarks:%s\n", this.name,this.gender,this.roll,this.marks);
	}
	
	Student(String name, char gender, int roll, float marks) {                   //parameterized constructor
		this.name= name;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
		
		++Student.count;    //convention for static variable
	
	}
	
	//constructor overloading
	
	//this must be the first statement 
	Student(){
		this("NA", 'm', -1, 0);
	}
	
	char getgrade() {
		char grade;
		
		if((marks>100) || (marks<0))
		{
			grade = 'I';
		}
		else if(marks>=70) {
			grade='A';
		}
		else if((marks>=60) && (marks<70))
		{
			grade='B';
		}
		else if((marks>=40) && (marks<60))
		{
			grade='C';
		}
		else
		{
			grade='F';
		}
return grade;
	}
	
	static Student newInstance(String name, char gender, int roll, float marks)
	{
		return new Student(name,gender,roll,marks);
	}

	
}

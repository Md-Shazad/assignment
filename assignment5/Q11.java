package assignment5;

import java.util.Objects;

record Student(String name, int id, int age) {
	static int count = 0;
	static void Count() {
		count++;
	}
	Student{
		Objects.requireNonNull(name);
		Objects.requireNonNull(id);
		Objects.requireNonNull(age);
		Count();
	}
}
public class Q11 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ravi",1011,23);
		//Student s2 = new Student("Jagdamba",1014,27);
		//Student s3 = new Student("Shruti",1022,28);
		Student s4 = new Student("Ravi",1011,23);
		
		System.out.println(s1.equals(s4));
		System.out.println(Student.count);
	}

}

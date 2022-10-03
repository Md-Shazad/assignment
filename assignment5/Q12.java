package assignment5;

sealed class Person permits Child,AnotherChild{
	String name;
	String getName() {
		return name;
	}
}

final class Child extends Person{
	String name;
	int age;
	Child(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	int getChildAge() {
		return age;
	}
}

non-sealed class AnotherChild extends Person{
	int age;
	AnotherChild(int age, String name){
		this.age = age;
		this.name = name;
	}
	int getAnotherChildAge() {
		return age;
	}
}

public class Q12 {

	public static void main(String[] args) {
		AnotherChild aChild = new AnotherChild(8,"gullu");
		System.out.println(aChild.getName());
		System.out.println("age "+aChild.getAnotherChildAge());
	}

}

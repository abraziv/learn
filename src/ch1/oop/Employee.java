package ch1.oop;

public class Employee {
	String name;
	String surname;
	int age;
	Address address;
	String gender;
	
	public String toString() {
		return "Employee { name: " + name + ", surname: " + surname + ", age: " + age + ", gender: " + gender + ", address: " + address + "}";		
	}
}

package ch1.oop;

public class Company {
	Address address;
	Employee[] employees = new Employee[100];
	String name;
	int count = 0;
	
	public String toString() {
		return "Company{ name: " + name + ", employee count: " + count + ", address: " + address + " }";
	}
}

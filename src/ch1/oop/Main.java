package ch1.oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		// Определение компании
		Company company = new Company();
		company.name = "Intel";
		company.address = new Address();
		company.address.city = "Kiev";
		company.address.street = "Schevchenko";
		company.address.building = 38;

		while (true) {
			// Вывод меню
			System.out.println("1. Info");
			System.out.println("2. Employees");
			System.out.println("3. Add Employee");
			System.out.println("4. Exit");
			System.out.println("5. Print femailes from Kiev");
			System.out.println("6. Dismiss last employee");
			
			// Чтение выбраного пункта меню
			int res = scn.nextInt();

			// определение выбранной операции
			if (res == 1) {
				System.out.println(company);
			} else if (res == 2) {
				
				for(int i=0; i < company.count; i++) {
					Employee e = company.employees[i];
					System.out.println(i + ": " + e);					
				}
				
			} else if (res == 3) {
				
				Employee e = new Employee();
				
				System.out.print("Enter name: ");
				String name = scn.next();
				e.name = name;
				System.out.print("Enter surname: ");
				e.surname = scn.next();
				System.out.print("Enter age: ");
				e.age = scn.nextInt();
				System.out.print("Enter gender: ");
				e.gender = scn.next();
				
				Address a = new Address();
				e.address = a;
				System.out.print("Enter city: ");
				a.city = scn.next();				
				
				company.employees[company.count] = e;
				company.count++;
				
			} else if (res == 4) {
				break;
			} else if (res == 5) {
				int printed = 0;
				for(int i=0; i < company.count; i++) {
					Employee e = company.employees[i];
					if (e.address.city.equals("Kiev") && e.gender.equals("f")) {
						printed++;
						System.out.println(e);
					}
				}
				if (printed == 0) {
					System.out.println("Нема блядей с Киева");
				}
			} else if (res == 6) {
				if (company.count < 1) {
					System.out.println("No employees in company");					
				} else {
					company.count--;
					company.employees[company.count] = null;
				}
			}
			 
		}
			
		
		scn.close();
	}

}

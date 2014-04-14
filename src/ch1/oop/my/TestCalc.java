package ch1.oop.my;
import java.util.Scanner;
public class TestCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while (true){		
			System.out.println("1: add 2 chisla");
			System.out.println("2: subtr 2 chisla ");
			System.out.println("3: multiply 2 chisla");
			System.out.println("4: divide 2 chisla ");
			System.out.println("5: Exit");
			System.out.println("");
			
			System.out.println("Выберите действие");
			int count = sc.nextInt();
			
			System.out.println("Enter number one");
			int num1 = sc.nextInt();
						
			System.out.println("Enter number two");
			int num2 = sc.nextInt();
			
			Calc num = new Calc(num1,num2);
			
			
			
			if(count == 1){
				Calc num3 = num.add(num1, num2);
				System.out.println(num3);
			}
			
			// Exit from program
			else if(count == 5){
				break;
			}
			
			
		}
		

	}

}

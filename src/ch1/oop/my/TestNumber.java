package ch1.oop.my;

public class TestNumber {
	// zdes ne vidit main
	public static void main (String[] args) {
		
		Number n1 = new Number(3);
		Number n2 = new Number(6);
		
		Number n3 = n1.add(n2);
		n3.getValue();
		
		//int n4 = n1.comp(n2);
		//System.out.println(n4);
		
		Number n5 = n1.pow(n2);
		n5.print();
		
		// TODO Auto-generated method stub

	}

}

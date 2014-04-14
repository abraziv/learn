package ch1.oop.my;

public class Calc {

	private int val1;
	private int val2;


public Calc(int num1, int num2){
	this.val1 = num1;
	this.val2 = num2;
}
public void print(){
	System.out.println();
}

public Calc(int i) {
	// TODO Auto-generated constructor stub
}

public int getVal1(){
	return val1;
}

public Calc add(int val1, int val2){
	return new Calc (val1+val2);
}

}
package ch1.oop.my;

import java.lang.Math;

public class Number {

	// ������ ���������� VALUE ���� ���
	private double value;
	
	// ������ �����������
	public Number (double num){
		this.value = num;
	}
	public void print(){
		System.out.println(value);
	}
	//������ ����������� �� ���������
	public Number(){
	}
	
	// ������ ����� ������� ���������� �������� ����� ���� ���
	public double getValue(){
		
		return value;
	}
	//	public void printVal(){
		//System.out.println(value);
	//}
	public Number add(Number number) {
		return new Number(value + number.getValue());
	}
	//subtraction - ��������� ����� ������� �������� ����� �� ������� �����
	public Number sub(Number number) {
		return new Number (value - number.getValue());
	}
	// multiplication - ���������. �������� - multiply
	public Number multi(Number number){
		return new Number (value * number.getValue());
	}
	//divide ��������� 
	public Number div(Number number){
		return new Number(value / number.getValue());
	}
	// pow  - �������
	public Number pow(Number number){
		return new Number(Math.pow(value, number.getValue()));
	}
	// integer remainder ������������� �������
	public Number intRem(Number number){
		return new Number(value % number.getValue());
	}
	// compare - ���������
	public int comp(Number number){
		if(value<number.getValue()) return -1;
		if(value>number.getValue()) return 1;
		return 0;
	
	}
	
	// factorial 
	public Number fuc(Number number){
		int result=1;
		for (int i = 0; i<=number.getValue(); i ++){
		result = result*i;
		}return new Number(result);
	}
	
	
}


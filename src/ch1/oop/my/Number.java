package ch1.oop.my;

import java.lang.Math;

public class Number {

	// создаём переменную VALUE типа ИНТ
	private double value;
	
	// создаём конструктор
	public Number (double num){
		this.value = num;
	}
	public void print(){
		System.out.println(value);
	}
	//Создаём конструктор по умолчанию
	public Number(){
	}
	
	// создаём метод который возвращает значение ВАЛЮЕ типа ИНТ
	public double getValue(){
		
		return value;
	}
	//	public void printVal(){
		//System.out.println(value);
	//}
	public Number add(Number number) {
		return new Number(value + number.getValue());
	}
	//subtraction - вычитание метод который отнимает число от другого числа
	public Number sub(Number number) {
		return new Number (value - number.getValue());
	}
	// multiplication - умножение. Умножить - multiply
	public Number multi(Number number){
		return new Number (value * number.getValue());
	}
	//divide разделить 
	public Number div(Number number){
		return new Number(value / number.getValue());
	}
	// pow  - степень
	public Number pow(Number number){
		return new Number(Math.pow(value, number.getValue()));
	}
	// integer remainder целочисленный остаток
	public Number intRem(Number number){
		return new Number(value % number.getValue());
	}
	// compare - сравнение
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


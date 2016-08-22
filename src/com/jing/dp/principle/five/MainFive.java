package com.jing.dp.principle.five;

//单一原则：每一个类都只负责单一的功能，并把此功能做到极致
public class MainFive {

	public static void main(String[] args) {
		Reader reader = new Reader("");
		reader.read();

		int a = reader.getA();
		int b = reader.getB();

		System.out.println("加法运算结果为: " + Caculator.add(a, b));
		System.out.println("减法运算结果为: " + Caculator.cut(a, b));
		System.out.println("取余运算结果为: " + Caculator.mod(a, b));
	}
}

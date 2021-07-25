package com.jizhong.pojo;
/**
 * 局部变量：只能作用于当前方法的大括号内部（定义在方法内部）
 * 成员变量：可以作用于整个类的内部（直接定义在类内部）
 */
public class Calculator {
	//成员变量
	double num1;
	double num2;
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {//12.99
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	//加法方法
	public double add(){
		//局部变量：只能作用于当前方法内部
		double sum = num1 + num2;
		return sum;
	}
	//查看结果
	public void showResult(){
		System.out.println(num1);//成员变量
		double sum = 12.00;
		System.out.println(sum);//局部变量
		System.out.println("加法计算得到结果为：" + add());
	}

}

package com.jizhong.pojo;

public class Score {
	double java;
	double c;
	double python;
	
	//alt + s ：打开快捷生成get set方法
	public double getJava() {
		return java;
	}
	public void setJava(double java) {
		this.java = java;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getPython() {
		return python;
	}
	public void setPython(double python) {
		this.python = python;
	}
	
	
	//计算平均成绩
	public double avg(){
		return (java + c + python) / 3;//平均成绩
	}
	
	//打印平均成绩
	public void showAvg(){
		System.out.println("Java C Python三科平均成绩为：" + avg());
	}
	//计算总成绩
	public double sum(){
		return java + c + python;
	}
	//打印总成绩
	public void showSum(){
		System.out.println("Java C Python三科总成绩为：" + sum());
	}
	
}

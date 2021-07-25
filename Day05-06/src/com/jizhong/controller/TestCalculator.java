package com.jizhong.controller;

import java.util.Scanner;

import com.jizhong.pojo.Calculator;

public class TestCalculator {
	public static void main(String[] args) {
		//1. 创建扫描对象
		Scanner sc = new Scanner(System.in);
		//2. 输入数值1
		System.out.println("请输入您的第一个数字：");
		double num1 = sc.nextDouble();
		//3. 输入数值2
		System.out.println("请输入您的第二个数字：");
		double num2 = sc.nextDouble();
		//4. 创建计算器对象（使用计算器添加方法）
		Calculator c = new Calculator();
		//4.1 设置num1属性为输入数值1
		c.setNum1(num1);
		//4.2 设置num2属性为输入数值2
		c.setNum2(num2);
		//5. 计算结果，并打印
		c.showResult();
		//6. 关闭扫描资源
		sc.close();
	}
}

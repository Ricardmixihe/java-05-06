package com.jizhong.controller;

public class TestFor {
	static int avg = 10;//成员变量
	public static void main(String[] args) {
		int sum = 0;//局部变量
		for(int i = 0; i < 100;i++){
//			int sum = i;//局部变量
			sum += i;
		}
		System.out.println(sum);
		System.out.println(avg);
	}
}

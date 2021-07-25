package com.jizhong.pojo;

public class Monkey {
	//属性
	String color;
	int age;
	String sex;
	String type;
	
	//方法
	public void climbTree(){
		System.out.println("小猴子爬树~~");
	}
	
	
	//返回值方法
	public String toString(){
		return "这只猴子" + age + "岁了," + color + "颜色";
	}

}

package com.jizhong.controller;

import com.jizhong.pojo.Monkey;

public class TestMonkey {
	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.climbTree();//爬树方法
		String str = m.toString();//返回对象详细信息
		System.out.println(str);
	}
}

package com.jizhong.controller;
import java.lang.String;

//通过import导入指定包下的类
//通配符*号，表示当前包下所有类全部导入
import com.jizhong.a.*;

/**
 * 
 * @author BaiHongyu
 * @version 1.1.0
 *
 */
public class TestA {
	
	/**
	 * args：这个参数是没用的
	 */
	public static void main(String[] args) {
		A a = new A();
		a.a();
		String string = "";
		B b = new B();
	}
}

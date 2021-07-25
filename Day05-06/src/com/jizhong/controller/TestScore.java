package com.jizhong.controller;

import com.jizhong.pojo.Score;

public class TestScore {
	public static void main(String[] args) {
//		double java = 100;
//		double c = 100;
//		double python = 100;
//		//计算平均成绩
//		double avg = (java + c + python) / 3;
//		//打印平均成绩
//		System.out.println(avg);
//		//计算总成绩
//		double sum = java + c + python;
//		//打印总成绩
//		System.out.println(sum);
		Score score = new Score();
		score.setJava(100);
		score.setC(100);
		score.setPython(100);
		score.showAvg();//打印平均成绩
		score.showSum();//打印总成绩
		
		
	}
}

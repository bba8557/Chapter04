package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {
	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(113, 115);
		Point p04 = new Point(1113, 1115);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		//pList.add(c01); 원은 담을수 없다.
		
		
		
		System.out.println(pList.size());
		
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		
		System.out.println(pList.get(1).getX());
		System.out.println(pList.get(1).getY());
		
		System.out.println(pList.get(2).getX());
		System.out.println(pList.get(2).getY());
		
		System.out.println(pList.get(0).toString());
		System.out.println(pList.get(1).toString());
		System.out.println(pList.get(2).toString());
		
		//지우기
		pList.remove(1); //배열 번호
		//pList.remove(p02) 주소값
		System.out.println("====================================");
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("====================================");
		System.out.println(pList.toString()); //Point toString() 구분할것
		
		System.out.println("====================================");
		//for 다른표현법 --> 향상된 for문 
		for(Point p : pList) { //p 하나담을 그릇 : 전체
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		
		//p04 를 2번째(방번호 1번[1]째 추가
		//pList.add(p04)
		pList.add(1, p04);
		System.out.println(pList.toString());
		
		System.out.println("====================================");
		
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		Circle c01 = new Circle(7);
		Circle c02 = new Circle(17);
		Circle c03 = new Circle(117);
		Circle c04 = new Circle(1117);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		cList.add(c04);
		
		System.out.println(cList.size());
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		for(Circle c : cList) {
			System.out.println(c.toString());
			System.out.println(c.getRadius());
		}
	}
}

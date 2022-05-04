package com.javaex.ex09;

public class Point {
	//책
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super(); // Object()
	}
	public Point(int x, int y) {
		super(); // Object()
		this.x = x;
		this.y = y;
	}
		
	//메소드 - gs
	//===========get=================
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//===========set=================
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

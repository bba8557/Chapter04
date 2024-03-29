package com.javaex.ex07;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
	
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드 - gs
	//=================get===============
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

	//=================set===============
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
	@Override
	public int hashCode() {
		int hashCode = x+y;
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result;
		Point p = (Point)obj;
		
		if((this.x == p.x) && (this.y == p.y)){
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	
}

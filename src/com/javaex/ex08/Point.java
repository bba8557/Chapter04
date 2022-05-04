package com.javaex.ex08;

import java.util.Objects;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 - gs
	// =================get===============
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// =================set===============
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	/*옛날거
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	*/
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

}

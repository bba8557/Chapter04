package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		//set 순서없음 중복저장 안됨
		Set<Integer> iset = new HashSet<Integer>();
		
		//int i = 12; 비교
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;
		
	
		
		iset.add(i01);
		iset.add(i02);
		iset.add(i03);
		
		
		System.out.println(iset.size());
		System.out.println(iset.toString());
		
		//향상된 for문
		for(Integer num : iset) {
			System.out.println(num.toString());
		}
		
		System.out.println("===============================");
		//중복체크
		//중복확인
		Integer i04 = 5;
		iset.add(i04);
		for(Integer num : iset) {
			System.out.println(num.toString());
		}
	}
}

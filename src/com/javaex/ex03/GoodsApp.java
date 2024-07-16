package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		List<Goods> supplies = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);

		System.out.println("상품을 입력해주세요. (종료 q)");

		while(true) {
			String input = sc.nextLine();
			if(input.equals("q")) {
				System.out.println("입력완료");
				System.out.println("=======================================");
				break;
			}else {
				String[] gear = input.split(",");
				Goods newSupply = new Goods(gear[0], Integer.parseInt(gear[1]),Integer.parseInt(gear[2]));
				supplies.add(newSupply);
			}
		}
		
		for(Goods i : supplies) {
			System.out.println(i.toString());
		}
		
		int sum = 0;
		for(Goods i : supplies) {
			sum += i.getCount();
		}
		
		System.out.println("모든 상품의 갯수는 " + sum+ " 개 입고 되었습니다.");


	}

}

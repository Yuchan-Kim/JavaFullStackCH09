package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		List<Friend> friends = new ArrayList<Friend>();

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요.");



		while(friends.size() != 3) {

			String input = sc.nextLine();
			String[] name = input.split(" ");
			Friend newUser = new Friend(name[0],name[1],name[2]);
			friends.add(newUser);




		}
		
		for (Friend i : friends) {
			System.out.println(i.toString());
		}
		
		sc.close();



	}

}

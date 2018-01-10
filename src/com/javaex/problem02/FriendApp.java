package com.javaex.problem02;

import java.util.*;

public class FriendApp {

	private static final int n = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Friend> friends = new ArrayList<>();
		String name, hp, school;

		System.out.println("친구를 " + n + "명 등록해주세요.");

		for (int i = 0; i < n; i++) {
			name = sc.next();
			hp = sc.next();
			school = sc.next();

			Friend friend = new Friend();
			friend.setName(name);
			friend.setHp(hp);
			friend.setSchool(school);

			friends.add(friend);
		}

		for (int i = 0; i < n; i++) {
			friends.get(i).showInfo();
		}
	}

}

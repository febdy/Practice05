package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	private static final int n = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "";
		int price = 0, count = 0, totalCnt = 0;
		List<Goods> goodsList = new ArrayList<>();
		Goods goods;

		System.out.println("상품 " + n + "개를 입력해주세요.");

		for (int i = 0; i < n; i++) {
			name = sc.next();
			price = sc.nextInt();
			count = sc.nextInt();

			goods = new Goods(name, price, count);
			goodsList.add(goods);
		}

		for (int i = 0; i < n; i++) {
			goods = goodsList.get(i);
			goods.printGoodsInfo();
			totalCnt += goods.getCount();
		}

		System.out.println("모든 상품의 개수는 " + totalCnt + "개입니다.");

	}

}

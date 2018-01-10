package com.javaex.problem03;

public class Goods {

	private String name;
	private int price;
	private int count;

	public Goods() {
	}

	public Goods(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void printGoodsInfo() {
		System.out.println(name + "(가격:" + price + "원)이 " + count + " 개 입고 되었습니다.");
	}
}

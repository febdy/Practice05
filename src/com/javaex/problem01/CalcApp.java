package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0, b = 0;
		String input = "", op = "";
		String[] inputSplit;
		boolean running = true;
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		while (running) {
			System.out.print(">> ");

			input = sc.nextLine();

			if (input.equals("/q")) {
				System.out.println("종료합니다.");
				running = false;
			} else {
				inputSplit = input.split(" ");

				a = Integer.valueOf(inputSplit[0]);
				op = inputSplit[1];
				b = Integer.valueOf(inputSplit[2]);

				switch (op) {
				case "+":
					add.setValue(a, b);
					System.out.println(">> " + add.calculate());
					break;
				case "-":
					sub.setValue(a, b);
					System.out.println(">> " + sub.calculate());
					break;
				case "*":
					mul.setValue(a, b);
					System.out.println(">> " + mul.calculate());
					break;
				case "/":
					div.setValue(a, b);
					System.out.println(">> " + div.calculate());
					break;
				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
				}
			}

		}
	}
}

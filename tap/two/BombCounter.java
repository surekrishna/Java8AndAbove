package com.java.krish.tap.two;

import java.util.ArrayList;
import java.util.List;

/*
 * Count the number of Bombs which didnot blast
   Input : ___##_###_##_ (# is bombs which didnot blast and _ is blast)
   Output : 7
 */
public class BombCounter {

	public static void main(String[] args) {
		System.out.println(countUnblastedBombs("___##_###_##_"));
		System.out.println(countUnblastedBombs1("___#_###_##_"));
		System.out.println(countUnblastedBombs2("___#_###_##_##"));
	}

	public static int countUnblastedBombs(String data) {
		int count = 0;

		for (char ch : data.toCharArray()) {
			if (ch == '#') {
				count++;
			}
		}

		return count;
	}

	public static int countUnblastedBombs1(String data) {
		return (int) data.chars().filter(b -> b == '#').count();
	}

	public static int countUnblastedBombs2(String data) {
		List<Character> list = new ArrayList<>();
		for (char ch : data.toCharArray()) {
			list.add(ch);
		}

		return (int) list.stream().filter(b -> b == '#').count();
	}

}

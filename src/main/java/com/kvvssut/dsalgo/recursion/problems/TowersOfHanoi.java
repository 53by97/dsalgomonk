package com.kvvssut.dsalgo.recursion.problems;

public class TowersOfHanoi {

	public static void main(String[] args) {
		towersOfHanoi(3, 'A', 'C', 'B');
	}

	private static void towersOfHanoi(int n, char from, char to, char aux) {
		if (n == 1) {
			System.out.println("Move disk 1 form [" + from + "] to [" + to +"]");
			return;
		}
		towersOfHanoi(n - 1, from, aux, to);
		System.out.println("Move disk " + n + " form [" + from + "] to [" + to +"]");
		towersOfHanoi(n - 1, aux, to, from);
	}

}

package com.kvvssut.dsalgo.dp.problems;

public class RecursiveCountPossibleCoinsSum_undone {

	public static void main(String[] args) {
		final int[] setOfCoins = { 1, 2, 5, 10 };
		final int sum = 23;

		final int possibleWays = countPossibleCoinsSum(setOfCoins, sum);

		System.out.println("Total possible ways: " + possibleWays);
	}

	private static int countPossibleCoinsSum(int[] setOfCoins, int sum) {
		if (sum == 0) {
			return 1;
		}

		int coinsLength = setOfCoins.length - 1;

		if (sum < 0 || coinsLength < 0) {
			return 0;
		}

		int[] subsetOfCoins = new int[coinsLength];

		for (int i = 0; i < coinsLength; i++) {
			subsetOfCoins[i] = setOfCoins[i];
		}

		return countPossibleCoinsSum(subsetOfCoins, sum - setOfCoins[coinsLength])
				+ countPossibleCoinsSum(subsetOfCoins, sum);
	}

}

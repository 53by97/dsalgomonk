package com.kvvssut.dsalgo.string.basics;

public class KMPStringMatching_undone {

	public static void main(String[] args) {
		final String text = "cbabababacababds";
		final String pattern = "abab";

		final int[] prefixArr = computePrefixArray(pattern);

		matchPattern(text, pattern, prefixArr);

	}

	private static void matchPattern(String text, String pattern, int[] prefixArr) {
		final int n = text.length();
		final int m = pattern.length();

		int q = 0;

		for (int i = 0; i < n; i++) {

			while (q > 0 && pattern.charAt(q) != text.charAt(i)) {
				q = prefixArr[q - 1];
			}

			if (pattern.charAt(q) == text.charAt(i)) {
				q = q + 1;
			}

			if (q == m) {
				System.out.println("Pattern exists at index: " + (i - m + 1));
				q = prefixArr[q - 1];
			}
		}
	}

	private static int[] computePrefixArray(String pattern) {
		final int m = pattern.length();
		final int[] prefixArr = new int[m];

		int k = 0;
		prefixArr[0] = 0;

		for (int q = 1; q < m; q++) {

			while (k > 0 && pattern.charAt(k) != pattern.charAt(q)) {
				k = prefixArr[k];
			}

			if (pattern.charAt(k) == pattern.charAt(q)) {
				k = k + 1;
			}

			prefixArr[q] = k;
		}

		return prefixArr;
	}

}

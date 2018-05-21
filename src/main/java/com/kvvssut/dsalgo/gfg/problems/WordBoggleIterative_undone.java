package com.kvvssut.dsalgo.gfg.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WordBoggleIterative_undone {

	public static void main(String[] args) throws IOException {
		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)) {
			String readLine = br.readLine();
			
			int testcases = Integer.parseInt(readLine);
			
			final String[][] dictionaries = new String[testcases][];
			final Character[][][] boggles = new Character[testcases][][];
			
			for (int i = 0; i < testcases; i++) {
				readLine = br.readLine();
				
				final int words = Integer.parseInt(readLine);
				
				dictionaries[i] = new String[words];
				
				readLine = br.readLine();
				
				final String[] dictionary = readLine.split(" ");
				
				for (int j = 0; j < words; j++) {
					dictionaries[i][j] = dictionary[j];
				}
				
				readLine = br.readLine();
				
				final String[] nm = readLine.split(" ");
				
				final int n = Integer.parseInt(nm[0]);
				final int m = Integer.parseInt(nm[1]);
				
				readLine = br.readLine();
				
				final String[] chars = readLine.split(" ");
				
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < m; k++) {
						boggles[i][j][k] = chars[n * j + k].charAt(0);
					}
				}
			}
			
			for (int i = 0; i < testcases; i++) {
				searchInDictionary(dictionaries[i], boggles[i]);
				System.out.println();
			}
			
		}
	}

	private static void searchInDictionary(String[] dictionary, Character[][] boggle) {
		final int words = dictionary.length;
		final int n = boggle.length;
		final int m = boggle[0].length;
		
		final List<String> wordList = new ArrayList<>();
		for (int i = 0; i < words; i++) {
			wordList.add(dictionary[i]);
		}
		
		final Boolean[][] visited = new Boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visited[i][j] = false;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int index = 0;
				for (String word : wordList) {
					if (boggle[i][j] == word.charAt(index)) {
						
					}
				}
			}
		}
		
	}

}

package net.projecteuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Problema42 {
	public static void main(String[] args) throws Exception {
		List<Integer> triangleNumbers = new ArrayList<Integer>();
		for(int n=1;n<20;n++)
			triangleNumbers.add((int)(n*(n+1)*0.5));
		
		BufferedReader bufRead = new BufferedReader(new FileReader("src/resources/words.txt"));
		String line = bufRead.readLine();
		bufRead.close();
		String[] words = line.replace("\"", "").split(",");
		
		int c=0;
		for(int i=0;i<words.length;i++){
			int wordVal = 0;
			for(int j=0;j<words[i].length();j++)
				wordVal += (Character.getNumericValue(words[i].charAt(j))-9);
			
			if(triangleNumbers.contains(wordVal))c++;
		}
		System.out.println("c:"+c);
	}
}

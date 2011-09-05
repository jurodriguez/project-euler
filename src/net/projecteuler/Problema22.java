package net.projecteuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Problema22 {
	public static void main(String[] args) throws Exception{
		BufferedReader bufRead = new BufferedReader(new FileReader("src/resources/names.txt"));
		String line = bufRead.readLine();
		bufRead.close();
		String[] names = line.replace("\"", "").split(",");
		Arrays.sort(names);
		
		int sum = 0;
		for(int i=0;i<names.length;i++){
			int numVal = 0;
			for(int j=0;j<names[i].length();j++)
				numVal += (Character.getNumericValue(names[i].charAt(j))-9);
			
			sum += numVal*(i+1);
		}
		System.out.println("names["+names.length+"].sum="+sum);
	}
}

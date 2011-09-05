package net.projecteuler;

import net.projecteuler.utils.Utils;

public class Problema35 {
	public static void main(String[] args){
		int n = 0;
		for(int i=2;i<1000000;i++){
			boolean circularPrime = true;
			if(Utils.isPrime(i)){
				for(int j = 1 ; j < String.valueOf(i).toCharArray().length; j++){
					if(!Utils.isPrime(rotate(i,j))) {
						circularPrime = false;
						break;
					}
				}
				if(circularPrime) n += 1;
			}
		}
		System.out.println("n="+n);
	}
	
	public static int rotate(int n, int k){
		char[] intChar = String.valueOf(n).toCharArray();
		char[] newChar = new char[intChar.length];
		
		for(int i=0;i<k;i++){
			char temp = intChar[0];
			for(int j=0;j<intChar.length-1;j++)
				newChar[j] = intChar[j+1];
			
			newChar[intChar.length-1] = temp;
			intChar = newChar;
		}
		
		return Integer.parseInt(String.copyValueOf(newChar));
	}
}

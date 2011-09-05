package net.projecteuler;

import java.math.BigInteger;

import net.projecteuler.utils.Utils;


public class Problema55 {
	public static void main(String[] args) {
		int c=0;
		for(int n=1;n<10000;n++){
			BigInteger bigN = new BigInteger(String.valueOf(n));
			BigInteger lychrel = Utils.reverse(bigN).add(bigN); 
			int i=0;
			while(!Utils.isPalindrome(lychrel)&& i<50){
				lychrel = lychrel.add(Utils.reverse(lychrel));
				i++;
			}
			if(i>=50) c++;
		}
		System.out.println("count:"+c);
	}
}

package net.projecteuler.utils;

import java.math.BigInteger;
import java.util.Arrays;

public class Utils {
	public static boolean isPalindrome(BigInteger bigNumber){
		char[] string = bigNumber.toString().toCharArray();
		return isPalindrome(string);
	}
	
	public static boolean isPalindrome(int number){
		char[] string = String.valueOf(number).toCharArray();
		return isPalindrome(string);
	}
	
	public static boolean isPalindrome(char[] string){
		for(int i=0;i<string.length/2;i++){
			if(string[i]!=string[string.length-i-1]){
				return false;
			}
		}
		return true;
	}
	
	public static BigInteger reverse(BigInteger n){
		char[] string = n.toString().toCharArray();
		char[] res = new char[string.length];
		for(int i=0;i<=string.length/2;i++){
			res[i] = string[string.length-i-1];
			res[string.length-i-1] = string[i];
		}
		return new BigInteger(String.copyValueOf(res));
	}
	
	public static boolean sameDigits(int num1, int num2){
		char[] numChar1 = String.valueOf(num1).toCharArray();
		Arrays.sort(numChar1);
		char[] numChar2 = String.valueOf(num2).toCharArray();
		Arrays.sort(numChar2);
		return Arrays.equals(numChar1, numChar2);
	}
	
	public static int numberOfFactors(int i) {
		int n=0, l=i;
		for(int j=1;j<=l;j++){
			if(i%j==0){
				n++;
				l=i/j;
			}
		}
		return n*2;
	}
	
	public static boolean isPrime(double num){
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num%i==0)
				return false;
			
		return true;
	}
	
	public static boolean isPrime(int num){
		double d = num; 
		return isPrime(d);
	}
}

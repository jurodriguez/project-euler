package net.projecteuler;

import net.projecteuler.utils.Utils;

public class Problema36 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<1000000;i++){
			if(Utils.isPalindrome(i)){
				if(Utils.isPalindrome(Integer.toBinaryString(i).toCharArray())){
					sum+=i;
				}
			}
		}
		System.out.println("Sum:"+sum);
	}
}

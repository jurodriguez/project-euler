package net.projecteuler;

import net.projecteuler.utils.Utils;

public class Problema07 {
	public static void main(String[] args){
		int i = 1, count = 1;
		while(count<=10001){
			i++;
			
			if(Utils.isPrime(i))
				count++;
		}
		System.out.println(i);
	}
}

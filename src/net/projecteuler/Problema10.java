package net.projecteuler;

import java.text.DecimalFormat;

import net.projecteuler.utils.Utils;


public class Problema10 {
	public static void main(String[] args){
		double sum = 0;
		for(int i=2;i<2000000;i++){
			if(Utils.isPrime(i)){
				sum += i;
			}
		}
			
		System.out.println("sum="+new DecimalFormat("#").format(sum));
	}
}

package net.projecteuler;

import java.math.BigInteger;

public class Problema25 {
	public static void main(String[] args){
		BigInteger v1 = new BigInteger("1");
		BigInteger v2 = new BigInteger("1");
		BigInteger sum = v1.add(v2);
		int n = 2;
		
		while(sum.toString().length()!=1000){
			sum = v1.add(v2);
			v1 = v2;
			v2 = sum;
			n++;
		}
		
		System.out.println("sum="+sum);
		System.out.println("n:"+n);
	}
}

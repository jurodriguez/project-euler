package net.projecteuler;

import java.math.BigInteger;

public class Problema56 {
	public static void main(String[] args) {
		int max = 0;
		for(BigInteger a = new  BigInteger("1");a.intValue() < 100;a=a.add(BigInteger.ONE)){
			for(int b=1;b<100;b++){
				BigInteger prod = a.pow(b);
				int sum = 0;
				for (char i : prod.toString().toCharArray()){
					sum += Character.getNumericValue(i);
				}
				if(sum>max) max=sum;
			}
		}
		System.out.println("maxsum:"+max);
	}
}

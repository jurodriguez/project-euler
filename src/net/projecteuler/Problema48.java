package net.projecteuler;

import java.math.BigDecimal;

public class Problema48 {
	public static void main(String[] args){
		BigDecimal sum = new BigDecimal("0");
		
		for(int i=1;i<=1000;i++){
			BigDecimal n = new BigDecimal(i);
			sum = sum.add(n.pow(i));
		}
		
		System.out.println("sum="+sum);
	}
}

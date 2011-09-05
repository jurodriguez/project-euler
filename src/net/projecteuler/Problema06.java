package net.projecteuler;

import java.text.DecimalFormat;

public class Problema06 {
	public static void main(String[] args){
		double sumOfSquares = 0;
		double sum = 0;
		
		for(int i=1;i<=100;i++){
			sumOfSquares += i*i;
			sum += i;
		}
		
		double diff = sum*sum -sumOfSquares;
		System.out.println("diff="+new DecimalFormat("#").format(diff));
	}
}

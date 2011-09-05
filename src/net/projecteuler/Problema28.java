package net.projecteuler;

import java.text.DecimalFormat;

public class Problema28 {
	public static void main(String[] args) {
		double i = 1, sum = 1;
		int n = 1;
		
		while(i<1002001){
			for(int j=1;j<=4;j++){
				i += n*2;
				sum += i;
				System.out.println("i="+i);
			}
			n++;
		}
		System.out.println("sum="+new DecimalFormat("#").format(sum));
	}

}

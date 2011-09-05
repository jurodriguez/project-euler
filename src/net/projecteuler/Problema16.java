package net.projecteuler;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Problema16 {
	public static void main(String[] args){
		BigDecimal num = new BigDecimal(2);
		
		for(int i=2;i<=1000;i++){
			num = num.multiply(new BigDecimal(2));
		}
		
		int sum = 0;
		for(char c:new DecimalFormat("#").format(num).toCharArray()){
			sum += Character.getNumericValue(c);
		}
		
		System.out.println("sum="+sum);
	}
}

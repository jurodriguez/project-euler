package net.projecteuler;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Problema20 {
	public static void main(String[] args){
		 BigDecimal num = new BigDecimal(100);
		
		for(int i=99;i>=1;i--){
			num = num.multiply(new BigDecimal(i));
		}
		
		int sum = 0;
		for(char c : num.toString().toCharArray()){
			sum += Character.getNumericValue(c);
		}
		
		System.out.println("100!="+new DecimalFormat("#").format(num));
		System.out.println("Suma de los digitos de 100! ="+sum);
	}
}
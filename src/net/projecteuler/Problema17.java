package net.projecteuler;

public class Problema17 {
	public static void main(String[] args) {		
		String[] units = {"","one","two","three","four","five","six","seven","eight","nine"};
		String[] tens =  {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] dozens = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		int sum = 0;
		for(int i=0;i<10;i++){
			String number = "";
			if(i>0) {
				number += units[i]+"hundredand";
				sum += (units[i]+"hundred").length();
			}
			for(int j=1;j<units.length;j++)
				sum += (number+units[j]).length();
			for(int j=0;j<tens.length;j++)
				sum += (number+tens[j]).length();
			for(int j=2;j<10;j++){
				String num = number + dozens[j];
				for(int k=0;k<10;k++)
					sum += (num + units[k]).length();
			}
		}
		sum += "onethousand".length();
		System.out.println("sum:"+sum);
	}
}

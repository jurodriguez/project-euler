package net.projecteuler;

public class Problema04 {
	public static void main(String[] args){
		int maxProd = 0;
		for(int i = 100;i<=999;i++){
			for(int j = 100;j<=999;j++){
				int prod = i*j;
				char[] numChar = String.valueOf(prod).toCharArray();
				if(numChar.length == 6)
					if(numChar[0] == numChar[5] &&
					   numChar[1] == numChar[4] &&
					   numChar[2] == numChar[3])
						if(prod>maxProd) maxProd=prod;
			}
		}
		System.out.println("max:"+maxProd);
	}
}

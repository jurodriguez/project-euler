package net.projecteuler;

public class Problema09 {
	public static void main(String[] args){
		loop:
		for(int i=1;i<500;i++)
			for(int j=1;j<500;j++){
				int k = 1000-i-j;
				if((i*i + j*j) == (k*k) && i+j+k == 1000){
					System.out.println("i:"+i+" j:"+j+" k:"+k+" prod:"+i*j*k);
					break loop;
				}
			}
	}
}

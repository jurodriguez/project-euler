package net.projecteuler;

public class Problema03 {
	public static void main(String[] args){
		double num = 600851475143d;
		for(int i=2;i<num;i++){
			if(num%i==0){
				num /= i;
				System.out.println(i);
			}
		}
		System.out.println(num);
	}
}

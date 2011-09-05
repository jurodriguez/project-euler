package net.projecteuler;

public class Problema21 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<10000;i++){
			int d = d(i);
			if(i==d(d) && i!=d) {
				sum+=i;
			}
		}
		System.out.println("sum:"+sum);
	}
	public static int d(int n){
		int sum = 0;
		for(int i = 1; i<n; i++){
			if(n%i == 0) sum+=i;
		}
		return sum;
	}
}

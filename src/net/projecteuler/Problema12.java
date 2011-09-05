package net.projecteuler;

import net.projecteuler.utils.Utils;

public class Problema12 {
	public static void main(String[] args) {
		int n = 0;
		for(int i=1;i<=99999;i++){
			n+=i;
			int f = Utils.numberOfFactors(n);
			if(f>500){
				System.out.println("n="+n);
				break;
			}
		}
	}
}

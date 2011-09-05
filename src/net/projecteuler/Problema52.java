package net.projecteuler;

import net.projecteuler.utils.Utils;

public class Problema52 {
	public static void main(String[] args) {
		for(int i=1;i<999999;i++){
			if(Utils.sameDigits(i, i*2) && Utils.sameDigits(i, i*3) &&
			   Utils.sameDigits(i, i*4) && Utils.sameDigits(i, i*5) &&
			   Utils.sameDigits(i, i*6)) {
				System.out.println("i="+i);
			}
		}
	}
}

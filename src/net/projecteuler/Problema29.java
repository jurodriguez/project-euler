package net.projecteuler;

import java.util.HashSet;
import java.util.Set;

public class Problema29 {
	public static void main(String[] args) {
		Set<Double> res = new HashSet<Double>();
		
		for(int a=2;a<=100;a++){
			for(int b=2;b<=100;b++){
				double c = Math.pow(a, b);
				res.add(c);
			}
		}
		System.out.println("res:"+res.size());
	}
}

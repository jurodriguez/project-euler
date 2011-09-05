package net.projecteuler;

public class Problema14 {
	public static void main(String[] args){
		int maxSteps = 0;
		
		for(int i=1000000;i>=1;i--){
			double n = i;
			int steps = 1;
			while(n!=1){
				if(n%2==0)
					n = n/2;
				else n = n*3 + 1;
				steps++;
			}
			if(steps>maxSteps) {
				maxSteps = steps;
				System.out.println("i="+i);
			}
		}
		
		System.out.println("steps="+maxSteps);
	}
}

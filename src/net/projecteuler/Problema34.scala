package net.projecteuler

object Problema34{

	def fact(n:Int):Int = {
		if (n==0) 
			return 1 
		else 
			return n * fact(n-1)
	}
	
	def main(args: Array[String]) {
		var sum = 0;
		for(i <- 10 until 100000){
			var sumOfDigits = 0;
			for(c <- i.toString){
				sumOfDigits += fact(c.toString.toInt)
			}
			if(i == sumOfDigits){
				sum += i
			}
		}
		println("sum="+sum)
	}
	
}
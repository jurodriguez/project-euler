package net.projecteuler

import scala.collection.mutable.ArrayBuffer

object Problema32 extends App{
	var perms = "123456789".permutations
	var nums = ArrayBuffer[Int]()

	for(s <- perms){
		var prod = s.substring(5,9).toInt
		if(s.substring(0,2).toInt * s.substring(2,5).toInt == prod ||
		   s.substring(0,1).toInt * s.substring(1,5).toInt == prod ){
			if(!nums.contains(prod)) nums += prod
		}
	}

	println("sum="+nums.sum)
}
package net.projecteuler

object Problema24 extends App {
	var perms = "0123456789".permutations
	for(i <- 0 until 999999){
	  perms.next
	}

	println(perms.next)
}
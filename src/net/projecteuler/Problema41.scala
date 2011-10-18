object Problema41{

	def main(args: Array[String]) {
		var perms = "7654321".permutations
		while(perms.hasNext){
			var i = perms.next.toLong
			if(isPrime(i)){
				println("n:"+i)
				return
			}
		}
	}

	def isPrime(num:Long):Boolean = {
		for(i <- 2L until (math.sqrt(num).toLong + 1)){
			if(num % i == 0)
				return false
		}
		return true
	}
}
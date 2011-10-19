import scala.collection.mutable.ArrayBuffer

object Problema37 {

	def main(args: Array[String]) {
		var	i = 23
		var truncablePrimes = ArrayBuffer[Int]()
		while(truncablePrimes.size < 11) {
			if(isPrime(i) && isTruncablePrime(i)){
				truncablePrimes += i
			}
			i += 1
		}
		println("sum:"+truncablePrimes.sum)
	}
	
	def isTruncablePrime(num:Long):Boolean = {
		var numL = num.toString; var numR = numL
		while(numL.size > 1){
			numL = numL.drop(1); numR = numR.dropRight(1)
			if(!isPrime(numL.toLong) || !isPrime(numR.toLong))
				return false
		}
		return true
	}
	
	def isPrime(num:Long):Boolean = {
		if(num == 1) return false
		for(i <- 2L until (math.sqrt(num).toLong + 1)){
			if(num % i == 0)
				return false
		}
		return true
	}
}
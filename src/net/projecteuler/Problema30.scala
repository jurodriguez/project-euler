var sum = 0;
for(i <- 10 until 200000){
	var sumOfDigits:Double = 0;
	for(c <- i.toString){
		sumOfDigits += scala.math.pow(c.toString.toInt, 5)
	}
	if(i == sumOfDigits){
		sum += i
	}
}
println("sum="+sum)
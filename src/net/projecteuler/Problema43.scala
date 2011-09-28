var perms = "0123456789".permutations
var sum:Long = 0

for(s <- perms){
	if(s.substring(7,10).toInt % 17 == 0 &&
	   s.substring(6,9).toInt % 13 == 0 &&
	   s.substring(5,8).toInt % 11 == 0 &&
	   s.substring(4,7).toInt % 7 == 0 &&
	   s.substring(3,6).toInt % 5 == 0 &&
	   s.substring(2,5).toInt % 3 == 0 &&
	   s.substring(1,4).toInt % 2 == 0 ){
		sum += s.toLong
	}
}

println("sum="+sum)
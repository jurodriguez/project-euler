package net.projecteuler

object Problema40{

  def main(args: Array[String]) {
    var num:StringBuffer = new StringBuffer
	for(i <- 1 to 1000000){
	  num.append(i)
	}
	
	var prod = (num.charAt(0).toInt - 48) * (num.charAt(9).toInt - 48) *
			   (num.charAt(99).toInt - 48) * (num.charAt(999).toInt - 48) *
			   (num.charAt(9999).toInt - 48) * (num.charAt(99999).toInt - 48) *
			   (num.charAt(999999).toInt - 48) 
	
	println("prod:"+prod)
  }
  
}
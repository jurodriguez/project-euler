package net.projecteuler

import scala.collection.mutable.ArrayBuffer

object Problema97 {
  def main(args: Array[String]) {
    val mod = BigInt("10000000000")
    var s = BigInt(2).modPow(7830457,mod)
    s = s*28433 + 1
    s %= mod
    println(s)
  }
}
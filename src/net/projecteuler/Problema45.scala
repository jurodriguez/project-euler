import scala.collection.mutable.ArrayBuffer

// No se incluyen los triangulares porque todos
// los hexagonales son triangulares por definicion.

def pentagonal(n:Long) = n * (3*n - 1) / 2
def hexagonal(n:Long) = n * (2*n - 1)

var p, h = ArrayBuffer[Long]()

for(i <- 1 until 100000){
	p += pentagonal(i)
	h += hexagonal(i)
}

println (p intersect h)

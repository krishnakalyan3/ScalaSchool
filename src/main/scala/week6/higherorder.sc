def isPrime(n:Int) = (2 until n) forall( n%_ != 0)


val n= 7
(1 until n)
  .flatMap(i => (1 until i)
    .map(j => (i,j)))
  .filter(x => isPrime(x._1+x._2))

for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i+j)
} yield (i,j)


def scalaProduct(xs : List[Double], ys : List[Double])
= (for((x,y) <- xs zip ys) yield x*y).sum

scalaProduct(List(1,2,3),List(1,2,3))
1 +4+9

def product(f:Int =>Int)(a:Int,b:Int):Int =
  mapReduce(f,(x,y)=>x*y,1)(a,b)

def mapReduce(f:Int => Int,combine :(Int,Int)=>Int, zero:Int)(a:Int,b:Int):Int =
if(a >b) zero
else combine(f(a),mapReduce(f,combine,zero)(a+1,b))


// Sets
val fruit = Set("apple","banana")
val s = (1 to 6).toSet
s.map(_+2)
fruit.filter(_.startsWith("app"))
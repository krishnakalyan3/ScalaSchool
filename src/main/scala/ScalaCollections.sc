val numbers = List(1,2,3,4)
Set(1,2,3)
val hostPort = ("localhost", 80)

hostPort._1
hostPort._2

hostPort match {
  case ("localhost",port ) => "hello"
    case(host,port) => "world"
}

1 -> 2

Map(1 -> 2)
Map("foo" -> "bar")
Map(1 -> Map("foo" -> "bar"))

trait Option[T] {
  def isDefined: Boolean
  def get: T
  def getOrElse(t: T): T
}

val number = Map("one" -> 1,"two" -> 2)
number.get("one")

number.get("three")

numbers.map((i: Int) => i * 2)

def timesTwo(i :Int) : Int =i * 2

numbers.map(timesTwo)

numbers.foreach((i:Int) => i * 2)

val doubled = numbers.foreach((i:Int) => i * 2)

numbers.filter((i :Int) => i%2 ==0)
def isEven(i :Int): Boolean = i% 2==0

numbers.filter(isEven _)

List(1,2,3).zip(List("a","b","c"))

val numbers1 = List(1,2,3,4,5,6,7,8,9,10)
numbers1.partition( _ % 2 == 0)

numbers1.find((i:Int) => i> 5)

numbers1.drop(5)

numbers1.dropWhile(_ % 2 ==0)

numbers1.foldLeft(0)((m:Int,n:Int)=>m +n)

numbers1.foldLeft(0){(m:Int,n:Int) =>println("m: " + m + " n " + n); m+n}

numbers1.foldRight(0){(m:Int,n:Int) => m+n}

/// Flatten next
List(List(1,2),List(3,4)).flatten

// FlatMap
val nestedNumbers = List(List(1,2),List(3,4))


nestedNumbers.flatMap(x => x.map(_ * 2))
nestedNumbers.map((x : List[Int]) => x.map(_ * 2)).flatten

val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)
extensions.filter({case (name,extension) => extension < 200})
// Basics
// https://twitter.github.io/scala_school/basics.html
// Variables
1 + 1
val two = 1 + 1
var name = "steve"
name = "krishna"
// Functions
def addOne(x : Int) = x + 1
val three = addOne(2)
def three1() = 1 + 2
three1
// Anonymous Functions
(x :Int ) => x + 1
val addOne2 = (x: Int) => x + 1
addOne2(1)
def timesTwo(x :Int) :Int ={
  println("HW")
  x*2
}
timesTwo(3)


{ i: Int =>
  println("hello world")
  i * 2
}.apply(2)



def adder(m: Int , n: Int) = m + n
val add2 = adder(2, _:Int)
add2(3)
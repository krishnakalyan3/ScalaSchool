1 + 2
def abs(x : Double): Double = if(x <0) -x else x

val x = 0
def f(y: Int) = y +1
val result = {
  val x = f(3); x * x
} + x

// Since } +x is outside the scope it takes value 0

def fact(x: Int): Int ={
  def loop(acc : Int, n : Int) : Int=
    if (n == 0) acc
    else loop(acc * n, n-1)
  loop(1,n)
}

fact(3)
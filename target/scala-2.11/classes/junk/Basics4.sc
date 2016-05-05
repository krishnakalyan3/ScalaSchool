class Foo{}

object Foo {
  def apply() = new Foo
}

val newFoo = Foo

object Timer {
  var count =0
  def currentCount(): Long ={
    count += 1
    count
  }
}

Timer.currentCount()

class Bar(f : String)
object Bar{
  def apply(foo: String) = new Bar(foo)
}

object addOne extends Function1[Int,Int]{
  def apply(m:Int):Int = m + 1
}

addOne(2)

class AddOne extends (Int => Int){
  def apply(m :Int) :Int = m + 1
}

val plusOne = new AddOne()
plusOne(5)

println("The color is "+ com.twitter.example.colorHolder.BLUE)

// Pattern Matching
val times = 1
times match {
  case 1 => "one"
  case 2 => "two"
  case _ => "others"
}


def bigger(o : Any): Any = {
  o match {
    case i: Int if i < 0 => i -1
    case i : Int => i+1
    case d : Double if d < 0.0 => d - 0.1
    case d : Double => d + 0.1
    case text : String => text + "s"
  }
}

bigger(6)
bigger(-7)
bigger(2.0)
bigger("Hellow W")



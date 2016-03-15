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

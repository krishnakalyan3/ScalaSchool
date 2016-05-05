def mul(x : Int)(y : Int): Int = x * y

mul(2)(3)

val timestwo = mul(2)_

timestwo(3)

def adder(m: Int, n: Int) = m + n

val curryadder = (adder _).curried
val addtwo = curryadder(2)

addtwo(3)

def capString(x : String*) = {
  x.map{
    x => x.toUpperCase
  }
}


capString("Krishna","Kalyan")

// Classes
class Cal{
  val brand: String = "HP"
  def add(m : Int, n : Int): Int = m + n
}

val calc = new Cal
calc.add(1,2)
calc.brand

class Calculator(brand: String){
  val color : String = if (brand == "TI"){
    "blue"
  }else if (brand == "HP"){
    "black"
  }
  else {
    "white"
  }

  def add(m:Int , n: Int) : Int = m +n

}
val calu = new Calculator("HP")
calu.color



class C {
    var acc = 0
    def minc = { acc += 1 }
    val finc = { () => acc += 1 }
   }

val c = new C
c.minc
c.finc

class Scal(brand : String) extends Calculator(brand){
  def log(m : Double ,base : Double) = math.log(m)/math.log(base)
}

class EScal(brand : String) extends Scal(brand){
  def log(m: Int): Double = log(m, math.exp(1))
}

// Abstract Classes
abstract class Shape{
  def Area() : Int
}

abstract class Circle(r: Int) extends Shape {
    def getArea():Int = { r * r * 3 }
   }


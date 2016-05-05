// Matching on Class Members
case class Calculator(brand: String, model: String)

val hp20b = Calculator("hp","20b")
val hp20B1 = Calculator("hp","20b")

hp20b == hp20B1

def calcType(calc: Calculator) = calc match {
  case Calculator("hp", "20B") => "financial"
  case Calculator("hp", "48G") => "scientific"
  case Calculator("hp", "30B") => "business"
  case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
  case _ => "Calculator of unknown type"
}

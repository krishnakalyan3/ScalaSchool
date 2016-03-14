trait Car{
  val brand : String
}

trait Shiny
{
  val shine :Int
}


class BMW extends Car with Shiny{
  val brand = "BMW"
  val shine = 12
}


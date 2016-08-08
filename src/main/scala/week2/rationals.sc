class Rational(x:Int, y:Int){

  require(y!=0,"Denomination should not be 0")

  private def gcd(a:Int, b:Int):Int =
  if(b == 0) a else gcd(b,a%b)

  private val g = gcd(x,y)
  def num = x/g
  def den = y/g

  def add(m:Rational) =
  new Rational(num * m.den + m.num*den,
    den*m.den)
  def neg:Rational =
  new Rational(-num,den)

  def sub(that:Rational) =
  add(that.neg)

  def less(that:Rational) =
  num*that.den < that.num * den

  def max(that:Rational) = if(this.less(that)) that.num else this
  override def toString = num + "/" + den
}
val x  = new Rational(1,3)
val y = new Rational(5,7)
val z = new Rational(3,2)
x.sub(y).sub(z)
y.add(y)

y.less(z)
y.max(z)
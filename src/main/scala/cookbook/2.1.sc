import java.util.Date

Short.MinValue
Short.MaxValue
Int.MinValue
Long.MinValue

"100".toInt

"100".toDouble

"1".toShort

"100".toByte

BigInt("1")

Integer.parseInt("100", 2)

implicit class StoI(s : String){
  def toInt1(radix :Int) = Integer.parseInt(s,radix)
}

"100".toInt1(2)

def toInt(s: String) = s.toInt
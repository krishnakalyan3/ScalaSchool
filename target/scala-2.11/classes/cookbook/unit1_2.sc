val upper = "Hello World".filter(_ != 'l').map(x => x.toUpper)
val upper1 = "hello, world".filter(_ != 'l').map(_.toUpper)

for(c <- "hello")println(c)

val upper3 = for(c <- "hello") yield c.toUpper

"hello".foreach(println)

"Hello".map( x => (x.toByte + 32).toChar )

def toLower(c:Char):Char = (c.toByte +32).toChar

"HELLO".map(toLower)

for (c<-"HELLO") yield toLower(c)

"hello".getBytes
val pattern = "[0-9]+".r
val add = "210 residence aime casare 401"
val mat = pattern.findFirstIn(add)
mat.foreach(println)

mat.foreach {
  e => println("Found match",e)
}


val add1 = "210 stree amin".replaceAll("[0-9]","x")

val regx = "[0-9]".r

val newadd = regx.replaceAllIn(add1,"x")

val regex1 = "H".r
val res = regex1.replaceFirstIn("Hello World","J")

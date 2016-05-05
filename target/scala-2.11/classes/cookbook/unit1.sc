for(i <- Array(1,2,3)) println(i)
// Transform if need to change collection use yield
for(i <- Array(1,2,3)) yield i *2
Array(1,2,3).map(_ * 2)

// Filter Items in a list
val nums = List(1,2,3,4)
nums.filter(_ < 4)
def f(n: Int) = 1 to n foreach { _ => println("Hello World")}
f(3)
150* 617 + 16*238
val num2 = List(1,2,3,4,5).filter(_ < 4).map(_*2)
Array(1,2,3).foreach(println)
"Hello World".getClass().getName
val s1 = "ab"
val s2 = "a" + "b"
s1 == s2
val speech = """This is a
              | multiline text """.stripMargin
"hello  World".split(" ")
"hello World".split(" ").foreach(println)
val k = "head,tail,milk"
k.split(",")
"hello world this is AI".split("\\s+")
val name = "Krishna"
val age = 27
val weight = 200.00
println(s"$name is $age is $weight is pounds")
println(s"My age next year will be ${age + 1}")
println(s"Age Check ${age == 27}")
case class Student(name: String, score: Int)
val hanna = Student("hanna",95)
println(s"${hanna.name} scored ${hanna.score}")
println(s"$name is $age is ${weight%.1f} is pounds")
val out = f"$name, you weigh $weight%.0f pounds."
s"foo\nbar"
raw"foo\nbar"
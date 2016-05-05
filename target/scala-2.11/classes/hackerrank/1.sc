def f(num:Int,arr:List[Int]):List[Int] =
  arr.flatMap(List.fill(num)(_))

val m = f(3,List(1,2,3))

List.fill(3)("foo")

def f1(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)


f1(3,List(1,2,3,4,56,5))
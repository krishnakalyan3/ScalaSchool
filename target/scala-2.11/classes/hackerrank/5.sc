def f(arr:List[Int]):List[Int] =
  arr.zipWithIndex.filter (_._2 % 2 != 0)
    .map(_._1)

f(List(1,1,1,3,4,5,6,1,2))


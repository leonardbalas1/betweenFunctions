def sumbetween(a:Int, b:Int): Int={
  if(a>b) 0 else a+sumbetween(a+1,b)
}
sumbetween(7,15)

def cube(x: Int): Int={
  x*x*x
}
def sumcube(a: Int, b:Int): Int={
  if(a>b) 0 else cube(a)+ sumcube(a+1,b)
}
sumcube(7,15)

import scala.annotation.tailrec

def fact(n: Int): Int = {
  @tailrec
  def loop(ac: Int, n: Int): Int =
    if (n == 0) ac
    else loop(ac * n, n - 1)

  loop(1, n)
}
def sumfact(a: Int, b: Int): Int=

  if(a>b) 0 else fact(a) + sumfact(a+1,b)

sumfact(2,4)
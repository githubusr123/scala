// RT, December 12, 2017. Scala 2.11.12 (2.12.4 is not working)
//import java.io._

object Loops {
   def main(args: Array[String]) {
      var x = 5
	  
	  println("While loop -")
	  while(x>0) {
	    println("x is " + x)
		x -= 1;
	  }
	  println("")
	  
	  println("Do-while -")
	  x=5
	  do {
	    println("x is " + x)
		x -= 1;
	  } while (x>0)
	  println("")
	  
	  println("for loop -")
	  x=5
	  var temp = 0
	  for (temp <- 1 to x) {
	    println("x is " + temp)
	  }
	  println("")

	  println("for loop / until -")
	  x=5
	  temp = 0
	  for (temp <- 0 until x) {
	    println("x is " + (temp+1))
	  }
	  println("")

	  println("for loop / multi -")
	  x=4
	  var y = 4
	  //var tempx = 0, tempy = 0 // Gives error that ; expected instead of ,
	  var tempx = 0; var tempy = 0 
	  for (tempx <- 1 to x; tempy <- 1 until y) {
	    println("x, y is " + tempx + ", " + tempy)
	  }
	  println("")

	  println("for loop / List -")
	  var listx = List(1, 3, 5, 7, 9)
	  temp = 0
	  for (temp <- listx) {
	    println("x is " + temp)
	  }
	  println("")

      // Testing blocks similar to java. Defining same variable in two blocks
	  {
	    println("for loop / List / filter / odd-")
	    var listx = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	    temp = 0
	    for (temp <- listx
		     if temp%2!=0) {
	      println("x is " + temp)
	    }
	    println("")
	  }
	  {
	    println("for loop / List / filter / Even-")
	    var listx = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	    temp = 0
	    for (temp <- listx;		     if temp%2==0) {
	      println("x is " + temp)
	    }
	    println("")
	  }

	  {
	    println("for loop / List / yield-")
	    var listx = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
	    temp = 0
	    var returnVal = for (temp <- listx; if temp%4==0) yield temp

		for (temp <- returnVal) {
	      println("x is " + temp)
	    }
	    println("")
	  }

	  
   }
/*
Loops.scala
- while
- do-while
- for

*/
}
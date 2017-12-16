// RT, December 12, 2017. Scala 2.11.12 (2.12.4 is not working)
//import java.io._

object Conditions {
   def main(args: Array[String]) {
      val x = 10
	  if (x<20) {
	     println("If condition - x is less than 20")
	  }
	  println("")

      if (x<5) {
	     println("If Else condition - if x<5 condition")
	  }	  
	  else {
	     println("If Else condition - else (x>=5) condition")
	  }	  
	  println ("")
	  
      if (x<5) {
	     println("If Else If Else condition - if x<5 condition")
	  }	  
      else if (x<10) {
	     println("If Else If Else condition - if x<10 condition")
	  }
	  else if (x<15) {
	     println("If Else If Else condition - if x<15 condition")
	  }
	  else {
	     println("If Else If Else condition - else (x>=15) condition")
	  }	  
	  println ("")

   }
/*
Conditions.scala

IF / ELSE
- Similar to java

*/
}
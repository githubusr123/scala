// RT, December 12, 2017. Scala 2.11.12 (2.12.4 is not working)
//import java.io._
import java.util.Date

object Functions {
   def main(args: Array[String]) {
   
       println("Calling a function -")
       println(" 5 + 7 = " + addInt(5, 7))
	   println(" addInt(No parms) = " + addInt()) // Using Default values for additions
	   println("")
	   
	   println("call-by-name. Evaluating a value is delayed till the method is called by providing the code needed to evaluate a value.")
       println("Current time is " + System.nanoTime)
	   delayed(time())
	   println("")
	   
	   println("Variable Arguments - ")
	   println(concatenate("Hello", " ", "World", "!!"))
	   println("")
	   
	   println("Nested functions (using factorial) / Recurssion -")
	   println("Factorial 6 is " + factorialNested(6))
	   println("")
	   
	   println("Recrusive functions (using factorial) / Recurssion -")
	   println("Factorial 6 is " + factorial(6))
	   println("Factorial is (default is 5) " + factorial())
	   println("")
	   
	   println("Partially applied function -")
	   val date = new Date()
	   val logWithDateBound = log(date, _ : String)
	   logWithDateBound(" Message 1")
	   Thread.sleep(1000);logWithDateBound(" Message 2")
	   Thread.sleep(1000);logWithDateBound(" Message 3")
	   println("")

	   println("Functions with named arguments -")
	   println(" Calling as printInt(5, 7):")
	   printInt(5, 7);
	   println(" Calling as printInt(b=7, a=5):")
	   printInt(b=7, a=5);
	   println("")

	   println("Functions (Higher Order) -")
	   println( apply( layout, 10) )
	   println("")
		
	   println("Anonymous functions -")
	     var inc = (x:Int) => x+10
	     var x = inc(7) - 1
	     println("inc(7)-1 is " + x)

	     var mult = (x:Int, y:Int) => x*y
	     var y = mult(3,4)
	     println("mult(3,4) is " + y)
		 
		 var userDir = () => {System.getProperty("user.dir")}
		 
	   println("")
   }
   
   def addInt(x:Int = 0, y:Int = 0) : Int = {
       var sum:Int = x + y;
	   return sum
   }
   
   //Call-by-name
   def time() = {
     System.nanoTime
   }
   def delayed (t: => Long) = {
     var i=0; var j=0
     for (i <- 1 to 10000000) j = i*i
     println("Delayed, time is " + t)
   }
   
   //Function with variable arguments
   def concatenate (args:String*) : String = {
       var returnStr = ""; var str = ""
       for (str <- args) {
	     returnStr += str;
	   }
	   return returnStr
   }
   
   //Nested Functions
   def factorialNested(i: Int = 5) : Int  = {
      def printI (j : Int ) = { 
	      println("Computing for " + j)
	  }
	  printI(i)
      if (i==1) return 1
	  else return(factorialNested(i-1)*i)
   }

   //Recurssion
   def factorial(i: Int = 5) : Int  = {
      if (i==1) return 1
	  else return(factorial(i-1)*i)
   }
   
   //Partially applied function
   def log(date: Date, str: String) = {
      println(date + " >> " + str)
   }

   // Functions with named arguments
   def printInt(a: Int, b:Int) = {
       println("a is " + a + " and b is " + b)
   }

   //@TODO - To look more into this
   //Higher Order Functions
   def apply(f: Int => String, v: Int) = f(v)
   def layout[A](x: A) = "[" + x.toString() + "]"   
   
   
   
   
   
   
   /*
Calculator_Functions.scala
- Functions

*/
}
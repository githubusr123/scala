// RT, December 13, 2017. Scala 2.11.12 (2.12.4 is not working)
//import java.io._
//import java.util.Date

object Arrays {
   def main(args: Array[String]) {
   
       println("Declaring Arrays -")
	   var weekDays1 = new Array[String](7)
	   weekDays1(0) = "Sunday"
	   weekDays1(1) = "Monday"
	   weekDays1(2) = "Tuesday"
	   weekDays1(3) = "Wednesday"
	   weekDays1(4) = "Thusday"
	   weekDays1(5) = "Friday"
	   weekDays1(6) = "Saturday"
	   println("Week days -")
	   for (weekDay <- weekDays1)
	     println(weekDay)

	   var weekDays2 = Array("Monday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday");	 
	   println("Weekday 4 is " + weekDays2(4))
		 
	   var myList = Array(1, 2, 3, 4,5)
	   for (myVal <- myList) println(myVal)
      }
}
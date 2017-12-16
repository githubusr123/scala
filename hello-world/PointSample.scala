// RT, December 12, 2017. Scala 2.11.12 (2.12.4 is not working)
import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move(deltax: Int, deltay: Int) {
      x = x + deltax
      y = y + deltay
      println ("Point location - (x:" + x + ", y:" + y +")");
   }
}

object PointSample {
   def main(args: Array[String]) {
      val pt = new Point(10, 20);
      println ("Point location - (x:" + pt.x + ", y:" + pt.y +")");
	  println ("")
	  
      // Move to a new location
      println("Move by (10, 10) ") 
	  pt.move(10, 10);
   }
/*
PointSample.scala

Class
- Class is blue print of objects
- Class Name works as class constructor. It can take parameters.
- Object can be created new with Class
- Class can be extended using extends
- Can extend only one class

ACCESS MODIFIERS
- Can be added to packages, classes or objects
- Can be labeled with private or protected. Default is public.
- protected member is only accessible from subclasses of the class
- Qualifiers can be added to private and protected such as private[scopeQualifier] where soapQualifier is in an enclosing package or class 


*/
}
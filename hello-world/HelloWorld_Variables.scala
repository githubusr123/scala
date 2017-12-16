// RT, December 11, 2017. Scala 2.11.12 (2.12.4 is not working)
object HelloWorld_Variables {
  def main(args: Array[String]) {
  
  val myvali : Int = 1
  val myvali_noDataType = 2
  var myvari : Int = 11
  var myvari_noDataType = 12
  println(myvali);println(myvali_noDataType);println(myvari);println(myvari_noDataType);
  
  println("")
  
  val myvals : String = "Hello World - val"
  val myvals_noDataType = "Hello World - val no datatype"
  var myvars : String = "Hello World - var"
  var myvars_noDataType = "Hello World - var no datatype"
  println(myvals);println(myvals_noDataType);println(myvars);println(myvars_noDataType);

  //val (myvar1: Int, myvar2: String) = MyMap(100, "Hello World")
  //println("myvar1 is " + myvar1)
  //println("myvar2 is " + myvar2)  
  }
/*
HelloWorldVariables.scala
VARIABLES
- Can be defined as constant (immutable) or variable (mutable)
  Immutable: val myval : String = "Hello World"
  Mutable:   var myvar : String = "Hello World"

SCOPE
- Fields: Defined in the object. Accessible within the object; from outside depending on access modifiers. Can be both mutable and immutable
- Method Parameters: Passed to a method. Only available within the method; but can be used outside with a refernce where it is pass-by-reference. Can be only immutable
- Local Variables: Only available within the method; but can be returned and made available outside. Can be mutable and immutable	
*/
}
// RT, December 11, 2017. Scala 2.11.12 (2.12.4 is not working)
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello World!")
	print("Hello "); println("World! using two statements in one line") // Need ; here as two statements in one line
	println("Hello\tWorld! using tab")
	println("Hello\nWorld! using new line char")
	
	println("Using printf and format methods -")
	var varfloat = 1.23
	var varint = 123
	var varstring = "Hello World 123"
	var fs = printf("Float is %f, int is %d, string is %s.", varfloat, varint, varstring)
	println(fs)
	println("")
	
	println("String Interpolator -")
	println(">>>> String s Interpolator ")
	println("1 + 1 = ${1 + 1}")
	var message = "Hello World"
	println(s"Message is $message")
	println(">>>> f Interpolator ")
	var mtEveHt = 8.848
	var mtEveHtUnits = "Km"
	var mtEveFullName = "Mt Everest"
	var message = "Hello World"
	println(f"Height of $mtEveFullName%s is $mtEveHt%3.3f")
	println(">>>> f Interpolator ")
	var mtEveHt = 8.848
	var mtEveHtUnits = "Km"
	var mtEveFullName = "Mt Everest"
	var message = "Hello World"
	println(raw"Hello\nWorld")
	println("")
	
	
	
  }
/*
COMMENTS
- Support Java like single line // or multiline / *   * / comments

NEWLINE CHAR
- ; is not needed, unless writing multiple lines on same line then are needed
- Example: println("Hello "); println("World!")

PACKAGES
- Use _ to import all classes from a package
    import scala.collection._
- Import a single class using
    import scala.collection.mutable.HashMap
- Import multiple classes from a single package using
    import scala.collection.immutable.{TreeMap, TreeSet}

DATA TYPES
- Same as java. Same precision

BASIC LITERALS
- Integers by default, append l / L for Long
- Double by default, append f / F for Float
- Boolean - true / false
	
*/
}
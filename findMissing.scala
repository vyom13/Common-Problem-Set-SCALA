object findMissing {
  def main (args:Array[String]){
   println("Enter first array(Elements are to be separated by Single Space): ")
   val s = readLine
   val a: Array[Int] = s.split(" ").map(_.toInt)   //Covert the string input to an Array of Integers
   println("Enter second array(Elements are to be separated by Single Space): ")
   val t = readLine //Enter the shuffled array with 1 element deleted.
   val b: Array[Int] = t.split(" ").map(_.toInt)
   for (i <- a.diff(b)) //Finds the difference between the Arrays and the prints it.
     print (i + " ")
 } 
}
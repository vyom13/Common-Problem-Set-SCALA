import scala.io.Source
import java.io._

object q4{

def main(args: Array[String]) {

        val count = 
        (for (line <- Source.fromFile("C:\\Users\\vyoms\\Desktop\\test.txt").getLines()) yield {
            //mention the path of the file the above line
      		val words = line.split("\\s+")
      		println(line)
     			 words.size
    		}).sum
  	  println(count)
      val writer = new File("output.txt")
      val bw=  new BufferedWriter(new FileWriter(writer))
      bw.write(count.toString)
      bw.close()   
          
}
}
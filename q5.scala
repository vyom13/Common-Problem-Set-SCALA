import scala.util.Random

object q5 {
  
  def randoms(p:String) : List[Char]={
    
    var perp = p.toList
    var a=0
    var perp1 = ""
    for( a <- 0 until 3){
      var check=Random.shuffle(perp).head
      
      do {
          check=Random.shuffle(perp).head
      }
      while (perp1.toList contains check)
    perp1+=check;
    }
    var perp2 = perp1.toList
    return perp2;
  }
  
  def main(args: Array[String]){
    var p = "abcdefg"
    var perp = randoms(p);
    //println(perp)
    var pl= Array(0,0,0)
    do {
      var crim=List[Char]()
    do {
         crim = randoms(p);
    }while((perp intersect crim)==3)
    println(crim)
    var common = perp intersect crim;
    
    var ans1=List[Char]()
    var ans2=List[Char]()
    var ans3=List[Char]()
    println("Number of actual perpetrators: "+common.length)
    if(pl(0)==0){
    println("Player 1: Do you want to pass??(Y/N)")
    var x = readChar;
    if (x=='y' || x=='Y'){
      pl(0)=0
      }
    else{
      
      println("Player 1: Enter the perpetrators:")
      ans1=readLine.toList
      println((perp intersect ans1).length)
      pl(0)=1
      
    }
    }
    if(pl(1)==0){
    println("Player 2: Do you want to pass??(Y/N)")
    var x=readChar;
    if (x=='y' || x=='Y'){
    pl(1)=0  
    }
    else
    {
      println("Player 2: Enter the perpetrators:")
      ans2=readLine.toList
      pl(1)=1
    }
    }
    if(pl(2)==0){
     println("Player 3: Do you want to pass??(Y/N)")
    var x=readChar;
    if (x=='y' || x=='Y'){
    pl(2)=0  
    }
    else
    {
      
      println("Player 3: Enter the perpetrators:")
      ans3=readLine.toList
      pl(2)=1
    }
    if( (perp intersect ans1).length == 3  )
      {
       println("Player 1 Wins !!!!!!")
       pl(0)=1
      }
    else if (pl(0)==0)
    {
      pl(0)==0
    }
    else{
      println("Player 1 You are out of the game")
      pl(0)=2
          }
    }
    if( (perp intersect ans2).length == 3  )
      {
       println("Player 2 Wins !!!!!!") 
       pl(1)=1
      }
     else if (pl(1)==0)
    {
      pl(1)==0
    }
    else{
      println("Player 2 You are out of the game")
      pl(1)=2
    }
    if( (perp intersect ans3).length == 3  )
      {
       println("Player 3 Wins !!!!!!") 
       pl(2)=1
      }
     else if (pl(2)==0)
    {
      pl(2)==0
    }
    else{
      println("Player 3 You are out of the game")
      pl(2)=2
    }
  } while((pl(0)==0 && pl(1)==0 && pl(2)==0)||(pl(0)==2 && pl(1)==0 && pl(2)==0) || (pl(0)==0 && pl(1)==2 && pl(2)==0)||(pl(0)==0 && pl(1)==0 && pl(2)==2)||(pl(0)==2 && pl(1)==2 && pl(2)==0)||(pl(0)==0 && pl(1)==2 && pl(2)==2)||(pl(0)==2 && pl(1)==0 && pl(2)==2))
  }
}
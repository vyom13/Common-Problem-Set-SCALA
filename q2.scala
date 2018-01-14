import scala.util.control.Breaks._

object q2{
def balance(s:String) 
{
	var l=s.toList
	var len= l.length
	var len2= len/2
	var count=0
	if(len%2==0) // If the length is even then only we will check it further otherwise it is No 
		{		
			(1 to len2) foreach { i =>
				
					var h= l.head
					var t= l.last
					if(h == '(' && t==')') // We will compare the first and last elements if they satisfy the condition 
						{	                      //The First and last elements are sliced so that the inner elements
							l=l.slice(1,len-1)  // Can be checked
							count=count+1
							len=len-2
						}
					else if (h == '{' && t=='}')
						{
							l=l.slice(1,len-1)
							count=count+1
							len=len-2
						}
					else if (h == '[' && t==']')
						{
							l=l.slice(1,len-1)
							count=count+1
							len=len-2
						}
					}
		  if(count==len2)	
		  	print("\nYes")
		  else 
		  	print("\n No")		
		}
	else 
	println("No")	
}
def main (args: Array[String]) {
    
    print("Enter your Input: ")// Takes input from the user
    var s = readLine
    balance(s)//Sends it to function balance for checking 
}
}

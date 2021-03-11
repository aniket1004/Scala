object Third
{
	def main(args : Array[String])
	{
		var str1 = ""
		var str2 = ""
		var str3 = ""
		
		print ("Enter First String =>")
		str1 = scala.io.StdIn.readLine()
		
		print("Enter Second String =>")
		str2 = scala.io.StdIn.readLine()
	
		if (str1.length >= str2.length)
		{
			str3 = str1.replaceAll(str2,"")
			print (s"After removing all occurrence of '$str2' in '$str1' the new string is '$str3'")
		}
		else
		{
			print ("First string smaller than second string (Invalid input)")
		} 
	}
}

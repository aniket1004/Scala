object Fourth
{
	def main(args : Array[String])
	{
		var N = 0
		var flag = 0
		
		print ("Enter number of elements =>")
		N = scala.io.StdIn.readInt()
		var arrayOfString = new Array[String](N)
		
		for (i <- 0 to N-1)
		{
			print (s"Enter "+(i+1)+" String =>")
			arrayOfString(i) = scala.io.StdIn.readLine()
 		}
		print ("Enter string that you want to search =>")
		var str = scala.io.StdIn.readLine()

		for (s <- arrayOfString)
		{
			if (s.contains(str))		
			{
				println (s" '$s' contains '$str' in it.")
				flag = 1
			}
		}
		if (flag == 0)
		{
			print (s"'$str' not found in array")
		} 
	}
}

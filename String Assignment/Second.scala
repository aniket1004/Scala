object Second
{
	def main(args : Array[String])
	{
		var str = ""
		var c = ' '
		var count = 0
		
		print ("Enter String =>")
		str = scala.io.StdIn.readLine()
		
		print("Enter character =>")
		c = scala.io.StdIn.readChar()
	
		if (str.length > 0)
		{
			for (s <- str)
			{
				if (s == c)
					count += 1
			}
			println (s"Number of occurence of character '$c' in String '$str' is $count")
		}
		else
		{
			println ("String is empty")
		}
	}
}

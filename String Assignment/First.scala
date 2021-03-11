object First
{
	def main (args: Array[String])
	{
		var count = 0;
		var newString = ""

		print ("Enter String =>");
		var str = scala.io.StdIn.readLine()
		
		for (s <- str)
		{
			if (s.isUpper)
			{
				count += 1
			}
			newString += (s.toLower)	
		}
		println(s"Number of uppercase letters are $count")
		print(newString)

	}
}
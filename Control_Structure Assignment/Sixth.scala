object Fifth
{
	
	def main(args : Array[String]) :Unit = 
	{
		print ("Enter number =>")
		var num = scala.io.StdIn.readInt()

		print (s"Binary Conversion of $num :")
		convertToBinary(num)
		println()
		print (s"Octal Conversion of $num :")
		convertToOctal(num)	
	}

	def convertToBinary(num : Int) : Unit =
	{
		if (num == 0)
			return

		convertToBinary(num/2)
		print(num%2)
	}

	def convertToOctal(num :Int):Unit =
	{
		if (num == 0)
			return
		
		convertToOctal(num/8)
		print(num%8)
	} 
}
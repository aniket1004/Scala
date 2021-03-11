object Fourth
{
	def main(args : Array[String]) : Unit = 
	{
		print ("How many numbers => ")
		var no = scala.io.StdIn.readInt()
		var arr = new scala.collection.mutable.ArrayBuffer[Int](no)
		for (i <- 1 to no)
		{
			print(s"Enter $i number => ")
			arr.append(scala.io.StdIn.readInt())
		}

		var max = arr(0)
		var secondMax = 0

		for (i <- arr)
		{
			if (max < i)
			{
				secondMax = max;
				max = i
			}
		}
		println (s"Second max number is $secondMax")
	}
} 
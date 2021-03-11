object First
{
	def main(args : Array[String]): Unit = 
	{
		print ("Enter starting number =>");
		var n1 = scala.io.StdIn.readInt();
		print ("Enter ending number =>");
		var n2 = scala.io.StdIn.readInt();

		var sum = 0;
		for ( i <- Range(n1,n2))
		{
			sum += i;
		}
		println("Sum"+sum)
		var avg = sum.toFloat/((n2-n1).toFloat);
		println(s"Average between numbers $n1 and $n2 is $avg");
	}
}
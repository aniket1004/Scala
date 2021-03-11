import scala.util.control.Breaks._

object Fifth
{
	
	def main(args : Array[String]) :Unit = 
	{
		var sum = 0
		
		
		for (i <- Range(1,100))
		{
			if (checkPrime(i))
				sum += i
		}		
		println (s"Sum of prime numbers between 1 to 100 is $sum")
	}

	def checkPrime(no : Int) : Boolean = 
	{
		var flag = 0

		breakable
		{
			for (i <- 2 to no-1)
			{
				if (no % i == 0)
				{
					flag = 1
					break
				}
			}	
		}
		if (flag == 1)
			return false

		return true
	}
}
object Third
{
    def main(args : Array[String]) : Unit =
    {
        val num = 5
        var no = 0
        for (i <- 1 to num)
        {
            no = scala.util.Random.nextInt(50)
            checkPrime(no)
        }
    }

    def checkPrime(no : Int) : Unit =
    {
	var sum = 0

	for (i <- 1 to no-1)
	{
		if (no % i == 0)
		{
			sum += i	
		}
	}
	if (sum == no)
		println(s"$no is perfect number");
	else
		println (s"$no is not perfect number");		
    }
}
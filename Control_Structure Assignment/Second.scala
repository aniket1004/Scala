object Second
{
    def main(args : Array[String]): Unit = 
    {
        print("Enter number => ");
        val num = scala.io.StdIn.readInt();

        val factorial = findFactorial(num);
        println (s"Factorial of $num is $factorial");
    }
    def findFactorial(num : BigInt): BigInt =
    {
        if (num <= 1)
        {
            return 1;
        }

        return (num * findFactorial(num-1));
    }
}
object Factorial
{
    def main(args: Array[String])
    {
        println("Enter the number");
        var n = scala.io.StdIn.readInt();
        println("The factorial of this number is: " + n * factorial(n-1));
    }

    def factorial(n: Int): Int = {
        if (n <= 1)
            1
        else
        n * factorial(n -1)
    }
}
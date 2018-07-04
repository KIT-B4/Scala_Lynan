
object Demo
{
  def main(args: Array[String])
  {
    val array = Array(5,10,15,20,25)

    //print all the array element
    for (i <- array)
    println(i);

    //sum all the array element
    var t=0;

    for (j <- 0 to (array.length - 1))
    {
      t += array(j);
    }
    println("The total of all array element" + t);

    //find the maximun of element
    var m=array(0);

    for (k <- 1 to(array.length - 1))
    {
      if(array(k) > m)
      m = array(k);
    }
    println("The maximum value is" + m);

    //concatenate array
    val array1 = Array(40,7,13,26)
    var array2 = Array.concat(array, array1);
    for (n <- array2)
    println(n);
  }
}


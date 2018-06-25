object Demo
{
  def main(args: Array[String])
  {
    val list1 = 25 :: (17 :: (12 :: Nil))
    val list2 = 44 :: (2 :: (6 :: (77 :: Nil)))

    println("Before reverse the number in list1: " + list1 );
    println("After reverse the number in list1: " + list1.reverse);
    println("Before reverse the number in list2: " + list2);
    println("Before reverse the numbe in list2: " + list2.reverse);

    val list1add = 42 :: list1
    println("After add the number in list1: " + list1add);

    val list2add = 89 :: list2
    println("After add the number in list2: " + list2add);

    val list3 = list1add :: (list2add :: Nil)
    println("List3: " + list3);
  }
}




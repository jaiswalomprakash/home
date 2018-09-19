class Hello
{
   public static void main(String[] args)
   {
      String hello = "Hello", lo = "lo";
      System.out.print((Other1.hello == hello) + " ");     //line 1 true
      System.out.print((Other1.hello == "Hello") + " ");   //line 2 true
      System.out.print((hello == ("Hel"+"lo")) + " ");       //line 3 true
      System.out.print((hello == ("Hel"+lo)) + " ");         //line 4 false
      System.out.println(hello == ("Hel"+lo).intern());      //line 5 true
      System.out.println(("Hel"+lo).hashCode());   //hashcode is 69609650 (machine depedent)
      System.out.println("Hello".hashCode());       //hashcode is same WHY ??.
   }
}

class Other1 { static String hello = "Hello"; }
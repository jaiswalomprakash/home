class Hello
{
  public  Hello(String m){
		System.out.println("Hello.Hello()");
	}

   public static void main(String[] args)
   {
	
	   String a = "tst";
	   String b = a;
	   a ="om";
	   System.out.println("Hello.main()--a "+a+ " =b "+b );
	   
      String hello = "Hello", lo = "lo";
      String s = new String("Hello");
    
      System.out.println((Other1.hello == hello) + " ");     //line 1 true
      System.out.println((Other1.hello == "Hello") + " ");   //line 2 true
      System.out.println((hello == ("Hel"+"lo")) + " ");       //line 3 true
      System.out.println((hello == ("Hel"+lo)) + " ");         //line 4 false
      System.out.println(hello == ("Hel"+lo).intern());      //line 5 true
      System.out.println(("Hel"+lo).hashCode());   //hashcode is 69609650 (machine depedent)
      System.out.println("Hello".hashCode());       //hashcode is same WHY ??.
   }
   
}



class Other1 { static String hello = "Hello"; }
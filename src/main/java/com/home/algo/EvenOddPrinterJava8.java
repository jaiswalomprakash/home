package com.home.algo;
//http://www.tutorialsdesk.com/2016/01/printing-even-and-odd-using-two-threads.html
public class EvenOddPrinterJava8 {
	
	static boolean flag = true;
	
	
	public static void main(String[] args) {
		
		
		Runnable odd = ()-> {						
			for (int i =1;i<=10; ){				
				if(EvenOddPrinterJava8.flag){					
					System.out.println(Thread.currentThread().getName()+" "+i);
					i+=2;					
					EvenOddPrinterJava8.flag = !EvenOddPrinterJava8.flag;					
				}			
			}
		};
		
		Runnable even = ()-> {						
			for (int i =2;i<=10; ){				
				if(!EvenOddPrinterJava8.flag){					
					System.out.println(Thread.currentThread().getName()+" "+i);
					i+=2;					
					EvenOddPrinterJava8.flag = !EvenOddPrinterJava8.flag;					
				}			
			}
		};
		
		Thread t1= new Thread(odd,"ODD");
		Thread t2 = new Thread(even,"EVEN");
		
		t1.start();
		t2.start();
		
		
		
	}
	
	
	
	

}

//https://dzone.com/articles/functional-programming-patterns-with-java-8
package com.home.java8.Excecise;

import java.util.function.BiFunction;

public class Movie {
	
		enum Type { NEW_RELEASE(PriceService :: calculateNewRealasePrice),
			REGUALR((p,i)->p.calcualteRegualrPrice(i));
			public final  BiFunction<PriceService, Integer, Integer> biFunction;
			private Type(BiFunction<PriceService, Integer, Integer> bifunction){
				this.biFunction= bifunction;
			}
		}
		
		final Type type;
		public Movie(Type type) {
			this.type =type;
		}
		
		
	   public static void main(String[] args) {		
			PriceService priceService = new PriceService();
			System.out.println(priceService.calculatePrice(Movie.Type.NEW_RELEASE, 2));
			System.out.println(priceService.calculatePrice(Movie.Type.REGUALR, 2));
		}
}

class PriceService {	
	public int calculateNewRealasePrice(int days){		
		return days+1;				
	}
	
	public int calcualteRegualrPrice(int days) {
		return days*2;
	}
	
	public int calculatePrice(Movie.Type type,int days){		
		return type.biFunction.apply(this, days);	
	}
	
}
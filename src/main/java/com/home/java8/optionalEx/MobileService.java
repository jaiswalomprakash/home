package com.home.java8.optionalEx;

import java.util.Optional;

public class MobileService {
	
/*	public int getMobileScreenWidthJavaOld(Mobile mobile){

		if(mobile != null){
			DisplayFeatures dfeatures = mobile.getDisplayFeatures();
			if(dfeatures != null){
				ScreenResolution resolution = dfeatures.getResolution();
				if(resolution != null){
					return resolution.getWidth();
				}
			}
		}
		return 0;

	}*/
	
	
	public int getMobileScreenWidth(Optional<Mobile> mobile){		
		 return mobile.flatMap(Mobile::getDisplayFeatures)
		 .flatMap(DisplayFeatures::getResolution)
		 .map(ScreenResolution::getWidth).orElse(0);
	}


}

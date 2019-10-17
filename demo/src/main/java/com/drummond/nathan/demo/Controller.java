package com.drummond.nathan.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

	@RequestMapping(value = "/api7/{numero1}/{numero2}/{numero3}", method = RequestMethod.GET)
	public String test(@PathVariable("numero1") Integer n1, @PathVariable("numero2") Integer n2,  @PathVariable("numero3") Integer n3) {
		
		double[] myList = {n1,n2,n3};

		double max = 0;
		      for (int i = 0; i < myList.length; i++) {
		         if (myList[i] > max){   
		             max = myList[i]; 
		         }
		      }  
		
		
		return "Maior valor é: "+Math.round(max);

	}

}

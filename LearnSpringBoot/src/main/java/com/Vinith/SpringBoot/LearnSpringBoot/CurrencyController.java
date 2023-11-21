package com.Vinith.SpringBoot.LearnSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyServiceConfiguration currency;
	
	@RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses()
    {
    	
    			return currency;
    }

}
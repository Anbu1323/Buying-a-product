package com.ecommerce;

import org.openqa.selenium.WebDriver;

public class Demo_Manager {
	public WebDriver test;
	
	private Loginpagerepo lr;
	private Productspagerepo ppr;
	
	public Demo_Manager(WebDriver test2) {
		this.test = test2;	
	}
	
	

	public Loginpagerepo Login_page() {
	if(lr==null) {
		lr = new Loginpagerepo(test);
		}
	return lr;
	}
	
	public Productspagerepo Buy_Page() {
		if(ppr==null) {
			ppr = new Productspagerepo(test);
		}
		return ppr;
	}
	
	
	
	
	

}

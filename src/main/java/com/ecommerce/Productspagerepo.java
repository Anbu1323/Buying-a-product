package com.ecommerce;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Productspagerepo {
	public WebDriver test;
	
	public Productspagerepo(WebDriver test2) {
		this.test = test2;
		PageFactory.initElements(Base_class.test, this);
		
	}
	
	
	
	public WebElement getMainmenu() {
	
		return Mainmenu;
	}

	public WebElement getClosemenu() {
		return Closemenu;
	}

	public WebElement getCartlist() {
		return Cartlist;
	}

	public WebElement getFilter() {
		return Filter;
	}
	
	public WebElement getLogout() {
		return Logout;
	}
	
	public WebElement getAllproducts() {
		return Allproducts;
	}
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement Mainmenu;
	
	@FindBy(id = "react-burger-cross-btn")
	private WebElement Closemenu;


	@FindBy(className = "shopping_cart_link")
	private WebElement Cartlist;
	
	@FindBy(xpath = "//select[contains(@data-test,'product_sort_container')]")
	private WebElement Filter;
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement Logout;

	@FindBy(xpath = "//div[contains(@class,'inventory_container')]")
	private WebElement Allproducts;

	



	public void setAllproducts(WebElement allproducts) {
		Allproducts = allproducts;
	}
	
	

}

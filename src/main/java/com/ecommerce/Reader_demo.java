package com.ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.io.Reader;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class Reader_demo {
	
	public Properties pr;
	public Reader_demo() throws Exception{
		
		File properties = new File("C:\\Users\\White_Devil\\eclipse-workspace\\Buying_product\\src\\main\\java\\com\\ecommerce\\demoproperties");
		FileInputStream input = new FileInputStream(properties);
		
		pr = new Properties();
		pr.load(input);
		
			
		}
	
	public  String browsername() {
		String browser = pr.getProperty("browsername");
		return browser;
	}
	
	public String Url() {
		String geturl = pr.getProperty("url");
		return geturl;
	}
	
	public String Username() {
		String name = pr.getProperty("username");
		return name;
	}
	public String Password() {
		String passwd = pr.getProperty("password");
		return passwd;
	}
	public String Login() {
		String login = pr.getProperty("login");
		return login;
	}

		
	public String Menu() {
		String Menu = pr.getProperty("openMenu");
		return Menu;
	}
	public String CloseMenu() {
		String closemenu = pr.getProperty("closeMenu");
		return closemenu;
	}
		
	public String Filters() {
		String filter = pr.getProperty("filter");
		return filter;
	}
	public String AddFilters() {
		String newfilter = pr.getProperty("showfilters");
		return newfilter;
	}
	
	
	public String Logout() {
		String logout = pr.getProperty("logout");
		return logout;
	}
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}



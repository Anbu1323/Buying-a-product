package com.ecommerce;

import java.io.Reader;

import org.openqa.selenium.WebDriver;

public class Test_product extends Base_class {
	
	public static WebDriver test;
	
	public static Demo_Manager dm = new Demo_Manager(test);
	
 
	public static void main(String[] args)throws Exception {
		
		String browsername = Reader_Demo_manager.Instant_Reader().Instant_Reader_Value().browsername();
		launchbrowser(browsername);
		
		String url = Reader_Demo_manager.Instant_Reader().Instant_Reader_Value().Url();
		getURL(url);
		
		
		String username = Reader_Demo_manager.Instant_Reader().Instant_Reader_Value().Username();
		Username(dm.Login_page().getUsername(), username);
		
		String password = Reader_Demo_manager.Instant_Reader().Instant_Reader_Value().Password();
		Password(dm.Login_page().getPassword(), password);
		
		String login = Reader_Demo_manager.Instant_Reader().Instant_Reader_Value().Login();
		ClickLogin(dm.Login_page().getLogin(), login);
		
	////Menu options Show
		String menu = Reader_Demo_manager.Instant_Reader().Instant_Reader_Value().Menu();
		ClickMenu(dm.Buy_Page().getMainmenu(), menu);
		
		Thread.sleep(2000);
		
		String closeMenu = Reader_Demo_manager.Instant_Reader().Instant_Reader_Value().CloseMenu();
		CloseMenu(dm.Buy_Page().getClosemenu(), closeMenu);
    
   //// Filters Options
		String filters = Reader_Demo_manager.Instant_Reader().Instant_Reader_Value().AddFilters();
		AddFilters(dm.Buy_Page().getFilter(), filters);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

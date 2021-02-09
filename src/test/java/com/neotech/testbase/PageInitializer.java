package com.neotech.testbase;

import com.neotech.pages.LoginPage;
import com.neotech.pages.MainPage;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;
	public static MainPage mainPage;

	public static void initialize() {
		// initialize pages
		loginPage = new LoginPage();
		mainPage = new MainPage();
	}

}

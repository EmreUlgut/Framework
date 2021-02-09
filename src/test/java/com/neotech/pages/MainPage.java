package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class MainPage {

	@FindBy(xpath = "//div[@class='app_logo']")
	public WebElement appLogo;

	public MainPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}

package study.selenium;

import org.junit.BeforeClass;

public class BaseTestClass {

	@BeforeClass
	public static void setupConfig() throws Exception {		
		com.codeborne.selenide.Configuration.browser = "chrome";
		com.codeborne.selenide.Configuration.baseUrl = "https://www.google.co.kr";
	
		
	}
}

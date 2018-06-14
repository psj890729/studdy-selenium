package study.selenium;

import static com.codeborne.selenide.Selenide.open;

import org.junit.Test;

public class TestTest extends BaseTestClass {
	
	@Test
	public void test() throws Exception {
		open("https://www.google.co.kr/");

		
	}
}

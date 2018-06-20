package study.selenium;

import static com.codeborne.selenide.Selenide.open;
import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

import study.selenium.page.NaverLoginPage;
import study.selenium.page.NaverMainPage;

public class Study0620Test extends BaseTestClass {
	static NaverMainPage mainPage ;
	static NaverLoginPage loginPage ;
	
	@BeforeClass
	public static void setup() throws Exception {
		open("https://www.naver.com");
		mainPage = new NaverMainPage();
	}
	
	@Test
	public void 로그인실패하는테스트_페이지오브젝트활용() throws Exception {
		loginPage = mainPage.login("idkdjfaksdlf", "pwlksdjflkajsd");
		
		assertThat(loginPage.getLoginErrorMessage()).contains("아이디 또는 비밀번호를 다시 확인하세요.");
	}
}

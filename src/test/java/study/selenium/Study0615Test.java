package study.selenium;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Test;

public class Study0615Test extends BaseTestClass {
	
	@Test
	public void 로그인실패하는테스트() throws Exception {
		open("https://www.naver.com");
		
		$("#id").should(visible).setValue("idasdfasdfasdfasdf"); 
		$("#pw").setValue("pw");
		$("#frmNIDLogin > fieldset > span > input[type=\"submit\"]").click();
		
		assertThat($("#err_common").should(visible).text()).contains("아이디 또는 비밀번호를 다시 확인하세요.");
	}
	
	@After
	public void teardown() throws Exception {
		close();
	}
}

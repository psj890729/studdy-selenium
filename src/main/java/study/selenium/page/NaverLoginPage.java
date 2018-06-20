package study.selenium.page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NaverLoginPage {

	public String getLoginErrorMessage() {
		return $("#err_common").should(visible).text();
	}
}

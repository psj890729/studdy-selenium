package study.selenium.page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NaverMainPage {

	public NaverLoginPage login(String id, String pw) {
		$("#id").should(visible).setValue(id); 
		$("#pw").setValue(pw);
		$("#frmNIDLogin > fieldset > span > input[type=\"submit\"]").click();
		return new NaverLoginPage();
	}
	
	// TODO
	public void logout() {
		
	}
	
	// TODO
	public void search(String keyword) {
		
	}
	
	// TODO
	public void moveToNews() {
		
	}
	
	// TODO
	public void moveToNews(String title) {
		
	}
}

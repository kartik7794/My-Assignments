package week2.day2;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {
		
		System.out.println("Check Button");
	}
	public static void main(String[] args) {
		 CheckBoxButton Ch=new CheckBoxButton();
		 Ch.click();
		 Ch.clickCheckButton();
	}
	
}

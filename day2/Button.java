package week2.day2;

public class Button extends WebElement {

	public void submit() {
		System.out.println("submit");
	}
	public static void main(String[] args) {
		Button BT=new Button();
		
		BT.click();
		BT.submit();
		BT.setText();	
	}
		
	
}

package week2.day2;

public class RadioButton extends Button {

	private void selectRadioButton() {
		
		System.out.println("Radio Button");

	}
	public static void main(String[] args) {
		RadioButton RD=new RadioButton();
		RD.click();
		RD.submit();
		RD.selectRadioButton();
	}
	
	
	
}

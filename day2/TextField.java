package week2.day2;

public class TextField extends WebElement {
private void gettext() {
 System.out.println("get text");

}
    public static void main(String[] args) {
		TextField TF=new TextField();
		
		TF.click();
		TF.gettext();
		TF.setText();
	}

}

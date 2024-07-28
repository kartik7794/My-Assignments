package week2.day2;

public class Browser {
     
	public void openurl() {
		System.out.println("open url");
    	
	}public void closebrowser() {
		System.out.println("close browser");
	}private void navigateback() {
		System.out.println("navigate back");

	}
	
	public static void main(String[] args) {
		String browser=("chrome");
		String version=("12");
		System.out.println(browser+" "+version);
       Browser br=new Browser();
       br.openurl();
       br.closebrowser();
	}

}

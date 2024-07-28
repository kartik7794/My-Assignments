package week2.day2;

public class chrome extends Browser {

	public void openIncognito() {
		System.out.println("open incognito");

	}public void clearCache() {
		System.out.println("clear cache");

	}
	public static void main(String[] args) {
		chrome ch=new chrome();
		ch.openurl();
		ch.openIncognito();
		ch.clearCache();
		ch.closebrowser();
		
	}
	
}

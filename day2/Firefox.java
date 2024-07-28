package week2.day2;

public class Firefox extends Browser {

	private void takesnap() {
		System.out.println("take snap");
        
	}private void clearcookies() {
		System.out.println("clear cookies");

	}public static void main(String[] args) {
		Firefox fr=new Firefox();
		fr.clearcookies();
		fr.clearcookies();
		fr.closebrowser();
		fr.openurl();
	}
}

package week1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstnumber=0, secondnumber=1, nextnumber, count=10;
		System.out.print(firstnumber+ " "+ secondnumber);
		for (int i = 0; i < count; i++) {
			nextnumber=firstnumber+secondnumber;
			System.out.print(" "+nextnumber);
			firstnumber=secondnumber; secondnumber=nextnumber;
			
			
				
					
			
		}
				

	}

}

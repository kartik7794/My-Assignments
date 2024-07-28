package week1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int array1[]=  {1,4,3,2,5,7,8,}; 
         Arrays.sort(array1);
         System.out.println(Arrays.toString(array1));
         for (int i = 0; i < array1.length; i++) {
			if (array1[i]!=i+1) {
				System.out.println("missing element: "+(i+1));
				break;
			}
		}


	}

}


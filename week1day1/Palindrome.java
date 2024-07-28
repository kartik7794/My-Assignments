package week1;

public class Palindrome {

	public static void main(String[] args) {
		 int remainder,output=0,input, temp =12331;    
		  input=temp ;    
		 
		  while(temp>0){    
		   remainder=temp%10;  //getting remainder  
		   output=(output*10)+remainder;    
		   temp=temp/10;    
		  }    
		  if(input==output)    
		   System.out.println(output + " is a " + "palindrome. ");    
		  else    
		   System.out.println(output + " is not a palindrome");    
		

	}


	
	
	}


// Write a Java program to practice using String class and its methods. 
public class StringClass{  
   public static void main(String args[]){  
	//Creating a string by java string literal 
	String str = "The Lost Cradle"; 
	char arrch[]={'D','i','v','y','a','n','k','a','r'}; 
	//Converting char array arrch[] to string str2
	String str2 = new String(arrch); 	
	//Creating another java string str3 by using new keyword 
	String str3 = new String("My Example"); 	
	//Displaying all the three strings
	System.out.println(str);  
	System.out.println(str2);  
	System.out.println(str3);  
   }
}

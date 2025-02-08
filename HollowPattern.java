import java.util.*;
public class HollowPattern
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		 System.out.println("Enter the no:");
	    int a = s.nextInt(); 
	  
	    for(int i=1;i<=a;i++){
	       
	       for(int k=1;k<=a;k++){
	         if (i == 1 || i == a || k == 1 || k == a)            
                   System.out.print("*");            
               else
                    System.out.print(" ");            
            } 
             System.out.println();
	       }
	      
	   }

	}   

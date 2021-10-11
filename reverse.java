import java.util.Scanner;

import java.util.*;


class reverse{
    
   public static void main(String[] args){
   
       
       Scanner myObj = new Scanner(System.in);
       
       System.out.println("Enter string to reverse: ");
       
       String str = myObj.nextLine();
       
       String tmp = "";
       
       int stringLength = str.length();
       
       
       
       System.out.println(stringLength);
       
       
       int i = 0;
       String newString;
       for (i = stringLength - 1; i >= 0; i--){
           
           tmp = tmp + str.charAt(i);
        }
           System.out.println(tmp);
        
       
       
       
       
       
       
       
   }
    
    
    
    
    
    
}

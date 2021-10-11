import java.util.Scanner;

import java.util.*;


class square{
    public static void main(String[] args){
        
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter area of shape: ");
        
        int num = myObj.nextInt();

        int array[][] = new int [num][num];
        
        
        
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
          
            array[i][j] = i * j;
        
            }
            
            for (int[] a : array) { for (int z : a) { System.out.print(i + "\t"); } System.out.println("\n"); }

      
        }
    
    
    }
    
    
}

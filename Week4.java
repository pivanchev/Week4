
package week4;
import java.util.Scanner;


public class Week4 {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number! ");
        int num=scan.nextInt();
        
        switch(num){
            case 1: 
                System.out.println("One");
                break;
                
            case 2: 
                System.out.println("Two");
                break;
                
            case 3: 
                System.out.println("Three");
                break;
                
            default:
                System.out.println("Please enter a valid number! ");
        }
        
        
    }
    
}


package week4;
import java.util.Scanner;


public class Week4_1 {
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string! ");
        String word=scan.nextLine();
        
        switch(word.toUpperCase()){
            
            case "ONE":
                System.out.println(word);
                break;
              
            case "TWO":
                System.out.println(word);
                break;
                
            case "Three":
                System.out.println(word);
                break;
                
            default:
                System.out.println("Invalid option!");
                
                

        }
        
        
    }
    
}

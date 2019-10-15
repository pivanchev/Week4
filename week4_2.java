
package week4;
import java.util.Scanner;

public class week4_2 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        char operator;
    	Double number1, number2, result;
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter operator: + , - , * or / ");
    	operator = scanner.next().charAt(0);
    	System.out.println("Enter number1: ");
        number1 = scanner.nextDouble();
        System.out.println("Enter number2: ");
        number2 = scanner.nextDouble();
    	
    	switch (operator) {
         case '+':
           result = number1 + number2;
    	   System.out.print(number1 + " " + "+" + " " + number2 + " = " + result);
           break;
         case '-':
           result = number1 - number2;
           System.out.print(number1 + " " + "-" + " " + number2 + " = " + result);
           break;
         case '*':
           result = number1 * number2;
           System.out.print(number1 + " " + "*" + " " + number2 + " = " + result);
           break;
         
         case '/': 
             result=number1/number2;
             System.out.println(number1 + " " + "/" + " " + number2 + " = " + result);
             
        }
        
    }
    
}

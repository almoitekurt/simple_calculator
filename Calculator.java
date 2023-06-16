import java.util.Scanner;
/**
 * Simple Calculator that will do the following operations ( +,-,*,/ ). 
 *  Will look ton add further functions in the future.
 *
 * @Kurt Almoite
 * @1.0 16JUN23
 */
 


public class Calculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a number: "); 
        double num1 = scanner.nextDouble();          // Takes in first num
        
        System.out.print("Please enter another number: ");
        double num2 = scanner.nextDouble();          // Takes in second num
        
        System.out.print("Please enter the operand to conduct: ");
        char operator = scanner.next().charAt(0);    // Takes in operation
        
        double result = 0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                break;
            default:
                System.out.println("Error");
                return;
        }
        System.out.println("Final Answer: " + result);
    }
}


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        double result = 0;
        boolean isWrong = false;

        System.out.print("Enter the first number: ");
        double num1 = keyboardInput.nextDouble();

        System.out.print("Enter an operator: ");
        String sign = keyboardInput.next();

        System.out.print("Enter the second number: ");
        double num2 = keyboardInput.nextDouble();

        if (sign.equals("+")){
            result = num1 + num2;
        }
        else if (sign.equals("-")){
            result = num1 - num2;
        }
        else if (sign.equals("/")){
            result = num1 / num2;
        }
        else if (sign.equals("*")){
            result = num1 * num2;
        }
        else {
            isWrong = true;
        }
        if (isWrong){
            System.out.println("Invlaid Operator!");
        }
        else {
            System.out.println("The result is " + result);
        }
    }
}

package se.lexicon;
import java.util.Scanner;

public class App {
    public static void main(String[]args){
        double num1,num2;

        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter any operation type: +,-,*,/");
            char operationType = in.next().charAt(0);

            double result;
            switch (operationType) {
                case '+':
                    System.out.println("Enter num1 and num2");
                    num1 = in.nextDouble();
                    num2 = in.nextDouble();
                    result = Calculator.addition(num1, num2);
                    System.out.println("Addition of two number is " + result);
                    break;
                case '-':
                    System.out.println("Enter num1 and num2");
                    num1 = in.nextDouble();
                    num2 = in.nextDouble();
                    result = Calculator.subtraction(num1, num2);
                    System.out.println("Subtraction of two number is " + result);
                    break;
                case '*':
                    System.out.println("Enter num1 and num2");
                    num1 = in.nextDouble();
                    num2 = in.nextDouble();
                    result = Calculator.multiplication(num1, num2);
                    System.out.println("Multiplication of two number is " + result);
                    break;
                case '/':
                    System.out.println("Enter num1 and num2");
                    num1 = in.nextDouble();
                    num2 = in.nextDouble();
                    result = Calculator.division(num1, num2);
                    System.out.println("Division of two number is " + result);
                    break;
                default:
                    System.out.println("Not a valid operation type");
            }

            System.out.println("Do you want to continue: yes/no");
            String decision = in.next();

            if (decision.equalsIgnoreCase("no"))
            {
                break;
            }
        }
    }
}

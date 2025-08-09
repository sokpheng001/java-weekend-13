package operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // primitive data type with arithmetic operators
        int number1 = 9;
        int number2 = 10;
        System.out.println("Sum: " + (number1+number2));
        System.out.println("Subtract: " + (number1-number2));
        System.out.println("Divide: " + number2/number1);// error
        System.out.println("Multiply: " + (number2*number1));
        System.out.println("Modulo Operator: " + (number2%number1));
    }
}

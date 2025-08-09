package operator;

public class AssignmentOperator {
    public static void main(String[] args) {
        // wrapper class with Assignment Operator
        Integer a = 2;
        Integer b = 3;
        System.out.println("Old value of a: " + a);
        System.out.println("Old value of b: " + b);
        a%=b;// a(new - ថ្មី) = a(old  - ចាស់) % b
        System.out.println("--\nNew Value of a: " + a);
        a-=b;// a = a -b;
    }
}

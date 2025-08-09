package operator;

public class UnaryOperator {
    public static void main(String[] args) {
        int number = 1;
//        int result1 = (number++) + (++number);
        int result2 = (--number)+(number--);

//        System.out.println("Result1: "  + result1);
        System.out.println("Result2: "  + result2);
        System.out.println(number);
    }
}

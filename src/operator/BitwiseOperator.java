package operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int number = 2;
        int result = number>>2;// right shift operator
        /**
         * value / 2 powered by bit shift number
         * 2 / 2 powered 2 = 2/4 = 0.5
         */
        System.out.println(result);
    }
}

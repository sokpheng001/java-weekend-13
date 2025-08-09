package operator;

public class RelationalOperator {
    public static void main(String[] args) {
        float avg1 = 3.5F;
        float avg2 = 4.5f;
        boolean result1 = avg1==avg2;// false
        boolean result2 = avg1!=avg2;//true
        boolean result3 = avg1>avg2;//false
        boolean result4 = avg1<avg2;// true
        boolean result5 = avg1>=avg2;// false
        boolean result6 = avg1<=avg2;// true
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
        System.out.println("Result4: " + result4);
        System.out.println("Result5: " + result5);
        System.out.println("Result6: " + result6);

    }
}

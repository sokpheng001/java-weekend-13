package datatypelesson;

public class DataTypeConversion {
    public static void main(String[] args) {
        // auto-boxing
        double avg1 = 12.25;// primitive data type
        Double avg2 = avg1;// wrapper class
        // unboxing
        Integer number1 = 12; // wrapper class
        int number2 = number1.intValue();// primitive data type
        // difference between primitive data type and wrapper class
        //int n1 = null; compile time error
        Integer n2 = null;
        int nnn = 0;
        Integer nn = 23;
    }
    /*

     */
}

package controlflowstatement;

public class ControlLesson {
    public static void main(String[] args) {
        boolean isFemale = true;
        double height = 1.75;
        char grade  = 'A';
        if(isFemale==true && height>1.65){
            System.out.println("This can be the army");
        }else if (grade == 'A'){
            System.out.println("Ohh,");
        }
    }
}

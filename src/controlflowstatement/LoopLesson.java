package controlflowstatement;
public class LoopLesson {
    public static void main(String[] args) throws Exception {
        int i=0;
        label1:
        while (true){
            i++;
            System.out.println("Message: "  +i);
            if(i==5){
                break label1;
            }
            label2:
            while (true){

                label3:
                while (true){

                }
            }
        }
    }
}

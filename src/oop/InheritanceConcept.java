package oop;

class Waiter{
    String waiterName;
    public Waiter(){
        this("");
    }
    public Waiter(String waiterName){
        this.waiterName = waiterName;
    }
    public void deliverOrder(){
        System.out.println("Waiter is delivered");
    }
}
class HumanWaiter extends Waiter {
    public HumanWaiter(){
        super("Jame");
    }
    public void run(){
        super.deliverOrder();
    }
}
class RobotWaiter extends Waiter {
    public void work(){
        super.deliverOrder();
    }
}
public class InheritanceConcept {
    public static void main(String[] args) {

    }
}

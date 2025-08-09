package controlflowstatement;

import java.util.Scanner;

public class LearnSwitchCase {
    public static void main(String[] args) {
        System.out.print("[+] Insert salary range: ");
        int salaryRange = new Scanner(System.in).nextInt();
        double tax = switch (salaryRange){
            case 250 -> {
                yield 0.1;
            }
            case 500-> {
                yield 0.12;
            }
            case 10000-> {
                yield 0.15;
            }
            default -> {
                yield 0.0;
            }
        };
    }
}

package datatypelesson;

import java.util.Scanner;
/**
 * <center style="color:'green' ">The class used for running Program</center>
 *  <img src="https://www.chetu.com/img/on-demand-developers/java/java-main/logo/java-logo.png"
 *      width="150" height="100"/>
 * @author Kim Chansokpheng
 * @serial 001
 * @version 1.0
 * @since 2017
 */
public class WrapperClassLesson {
    public static void main(String[] args) {
        // This is single line comment
        /*
        This is the multiple lines comment
        This is new line
         */
        System.out.print("[+] Insert Gender (M/F): ");
        char gender = new Scanner(System.in).nextLine().charAt(0);
        System.out.print("This is gender: " + gender);
    }
}

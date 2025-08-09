package classlesson;

import java.util.Scanner;

public class User{
    private int id;
    private String email;
    private String password;
    //
    public void insertUserData(){
        System.out.print("[+] Insert id: ");
        this.id = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert email: ");
        this.email = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert password: ");
        this.password = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
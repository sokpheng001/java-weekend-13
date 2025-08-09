package classlesson;

import java.util.Scanner;

public class Employee {
    private Integer id;
    private String name;
    private String email;
    private Double salary;
    //
    public void insertEmployeeData(){
        System.out.print("[+] Insert ID: ");
        this.id = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert name: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert Salary: ");
        this.salary = new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}

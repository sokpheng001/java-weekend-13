package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeArrayList {
    private static ArrayList<String> names = new ArrayList<>();
    private static void thumbnail(){
        System.out.println("""
                ============ Students' name Management =============
                1. Insert new Student's name
                2. Update Student's name
                3. Delete Student's name
                4. Search Student's name
                5. List Student's name
                6. Exit
                -------""");
    }
    static int chooseOption(){
        System.out.print("[+] Insert option: ");
        return new Scanner(System.in).nextInt();
    }
    static void insertStudentName(){
        System.out.print("[+] Insert Student's Name: ");
        String name = new Scanner(System.in).nextLine();
        names.add(name);
        System.out.println("[+] Insert name successfully");
    }
    static void updateStudent(){
        System.out.print("[+] Insert old student's name: ");
        String oldName = new Scanner(System.in).nextLine();
        for(String name: names){
            if(oldName.equals(name)){
                System.out.print("[+] Insert new student's name: ");
                String newName = new Scanner(System.in).nextLine();
                // find the index of old name
                int oldNameIndex = names.indexOf(oldName);
                names.set(oldNameIndex,newName);
                System.out.println("[+] Update student's name successfully");
                return;
            }
        }
        System.out.println("[!] Student's name is not Found!!");
    }
    static void deleteStudent(){
        System.out.print("[+] Insert student name to delete: ");
        String name = new Scanner(System.in).nextLine();
        boolean isDeleted  =names.remove(name);// remove by object
        if(isDeleted){
            System.out.println("[+] Deleted student's name successfully");
            return;
        }
        System.out.println("[!] Student's name is not Found!!");
    }
    static void searchStudent(){
        if(names.isEmpty()){
            System.out.println("No students' name yet".toUpperCase());
            return;
        }
        System.out.print("[+] Insert name to search: ");
        String name = new Scanner(System.in).nextLine();
        boolean isFound = false;
        for(String n: names){
            if(n.equalsIgnoreCase(name) || n.toLowerCase()
                    .startsWith(name.toLowerCase())){
                System.out.println("--> " + n);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("[!] Student's name is not Found");
        }
    }
    static void listAllStudent(){
        System.out.println("--------------");
        if(names.size()==0){
            System.out.println("No students' name yet".toUpperCase());
            return;
        }
        for(String name: names){
            System.out.print(names.indexOf(name) + ". ");
            System.out.println(name);
        }
    }
    static void pressEnter(){
        System.out.print("Press Enter to continue...");
        new Scanner(System.in).nextLine();
    }
    public static void main(String[] args) {
        while (true){
            thumbnail();
            int opt = chooseOption();
            switch (opt){
                case 1->{
                    // insert student's name
                    insertStudentName();
                    pressEnter();
                }
                case 2->{
                    // update student's name
                    updateStudent();
                    pressEnter();
                }
                case 3->{
                    deleteStudent();
                    pressEnter();
                }
                case 4->{
                    searchStudent();
                    pressEnter();
                }
                case 5->{
                    listAllStudent();
                    pressEnter();
                }
                case 6->{
                    System.out.println("[!] System Exit...");
                    System.exit(0);
                }
            }
        }
    }
}

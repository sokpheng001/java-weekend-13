package classlesson;

public class ClassAndObjectDay2 {
    public static void main(String[] args) {
        User user = new User();
        user.insertUserData();
        System.out.println(user);
        Employee employee = new Employee();
        employee.insertEmployeeData();
        System.out.println(employee);
    }
}

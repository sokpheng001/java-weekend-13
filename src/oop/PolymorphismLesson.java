package oop;

interface ApplicationService{
    // abstract method - method no body
    void run();
    void get();
}
class ProductService implements ApplicationService{
    @Override
    public void run() {
        System.out.println("Product Service");
    }
    @Override
    public void get() {
        System.out.println("Get in Product Service");
    }
}
class EmployeeService implements ApplicationService{
    @Override
    public void run() {
        System.out.println("Employee Service");
    }

    @Override
    public void get() {
        System.out.println("Employee get Service");
    }
}

public class PolymorphismLesson {
    public static void main(String[] args) {
        ApplicationService
                userService = new EmployeeService();
        userService.get();
    }
}

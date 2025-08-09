package oop;

public class Person{
    private int id;
    private String email;
    private String name;
    //
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

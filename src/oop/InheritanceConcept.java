package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class User{
    private String uuid;
    private String name;
    private String email;
    private String password;
    // constructor
    public User(){
        System.out.println("Constructor1 is calling");
    }
    public User(String uuid, String name, String email, String password){
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getUuid(){
        return uuid;
    }
    public void setName(String name){
        this.name  =name;
    }
    @Override
    public String toString() {
        return "User{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
        User user1 = new User(UUID.randomUUID().toString(),
                "Jame",
                "jame123@gmail.com",
                "@#$@@$");
        User user2 = new User( UUID.randomUUID().toString(),
                "Jello",
                "jelly123@gmail.com",
                "@#$%$#");
        List<User> users = new ArrayList<>(List.of(
                user1, user2
        ));
        users.stream()
                .filter(u->u.getUuid()!=null)
                .map(u->{
                    u.setName("user");
                    return u;
                });
        //CRUD OPERATION
    }
}

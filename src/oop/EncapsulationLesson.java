package oop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product{
    private Integer id;
    private String pName;
    private String pCode;
    private LocalDate createdDate;
    private LocalDate expiredDate;
    //
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", pCode='" + pCode + '\'' +
                ", createdDate=" + createdDate +
                ", expiredDate=" + expiredDate +
                '}';
    }
}
public class EncapsulationLesson {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(1);
        p1.setpName("Coca");
        p1.setpCode("abdd");
        p1.setCreatedDate(LocalDate.now());
        p1.setCreatedDate(LocalDate.of(2030,3,3));
        //
        Product p2 = new Product();
        p2.setId(12);
        p2.setpName("Pepsi");
        p2.setpCode("sfg");
        p2.setCreatedDate(LocalDate.now());
        p2.setExpiredDate(LocalDate.of(2030,3,3));
        //
        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        System.out.print("[+] Insert id to search: ");
        int id = new Scanner(System.in).nextInt();
        productList.stream()
                .filter(p->p.getId()==id)
                .forEach(System.out::println);
        /**
         * 1. Create a class called Product that contains attribute like below
         * (id, pName, pCode, createdDate, expiredDate) as private member
         * 2. Create setter and getter method inside Product class
         * 3. Create 3 Objects from this Product class and ADD them to ArrayList
         * 4. Use the product array to search product with any id
         */
    }
}

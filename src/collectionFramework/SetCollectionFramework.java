package collectionFramework;

import java.util.*;

public class SetCollectionFramework {
    static TreeSet<Long> idNumber = new TreeSet<>();
    public static void main(String[] args){
        idNumber.add(4L);
        idNumber.add(3L);
        idNumber.remove(3L);
        idNumber.getFirst();
        idNumber.getLast();

    }
}

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int arraySum(int [] numbers){
        int total = 0;
        for(int i=0;i<numbers.length;i++){
            total+=numbers[i];
        }
        return total;
    }
    public static void main(String[] y) {
        Map<Object, Object> data
                 = new HashMap<>();
        data.put("user",new HashMap<String, Object>(
                Map.of("name","jame",
                        "age",18,
                        "email","jame123@gmail.com",
                        "birthOfDate", LocalDate.of(1999,9,9))
        ));
        Map<String, Object> userData
                 = (Map<String, Object>) data.get("user");
        Integer age = (Integer) userData.get("age");
        System.out.println(age);
    }
}
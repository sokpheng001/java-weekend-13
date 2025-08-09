package collectionFramework;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

enum Role{
    ROLE_ADMIN,
    ROLE_USER
}
public class MapCollectionFramework {
    public static void main(String[] args) {
        HashMap<String, Object> data
                 = new HashMap<>();
        data.put("sub","73445abb-8767-4a84-92ae-e2789f19515d");
        data.put("roles",new ArrayList<>(List.of(Role.ROLE_ADMIN, Role.ROLE_USER)));
        data.put("iat", LocalDate.now());
        data.put("exp",LocalDate.of(2026,6,6));
        System.out.println(data);

    }
}

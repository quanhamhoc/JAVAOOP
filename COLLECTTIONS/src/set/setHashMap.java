import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class setHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("CSLT"," Co So Lap Trinh");
        hashMap.put("C++","C++");
        hashMap.put("C#","C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "java");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println(" cac entry co trong setHashMap :");
        System.out.println(setHashMap);
    }
}

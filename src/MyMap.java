import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // ============ put() ============
        map.put("Ram",   95);
        map.put("Shyam", 87);
        map.put("Mohan", 92);
        System.out.println("Map       : " + map);

        // ============ get() ============
        System.out.println("get(Ram)  : " + map.get("Ram"));

        // ============ containsKey() ============
        System.out.println("containsKey(Ram)   : " + map.containsKey("Ram"));
        System.out.println("containsKey(Rohan) : " + map.containsKey("Rohan"));

        // ============ containsValue() ============
        System.out.println("containsValue(95)  : " + map.containsValue(95));

        // ============ remove() ============
        map.remove("Shyam");
        System.out.println("remove(Shyam) : " + map);

        // ============ size() ============
        System.out.println("size()     : " + map.size());

        // ============ keySet() ============
        System.out.println("keySet()   : " + map.keySet());

        // ============ values() ============
        System.out.println("values()   : " + map.values());

        // ============ entrySet() — loop ============
        System.out.println("\n== Loop through Map ==");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
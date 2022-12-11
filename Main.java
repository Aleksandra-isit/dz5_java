import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "white");
        map.put(2, "green");
        map.put(3, "pink");
        map.computeIfAbsent(4, k -> "Yellow Mellow");

        Set<Integer> keySet = map.keySet();
        for (int i: keySet) {
            map.compute(i, (k,v) -> v = v + "!");
        }

        map.forEach((k,v) -> System.out.println("key: " + k + ", value: " + v));
        System.out.println();

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(12, "white");
        treeMap.put(13, "green");
        treeMap.put(7, "pink");
        treeMap.put(9, "cherry");
        treeMap.put(87, "lemon");
        treeMap.put(3, "purple");

        Set<Integer> keySetTreeMap = treeMap.keySet();
        for (int i: keySetTreeMap) {
            treeMap.compute(i, (k,v) -> v = v + "!");
        }
        treeMap.forEach((k,v) -> System.out.println("key: " + k + ", value: " + v));

        Integer s = map.size();
        for (int i = 0; i < 1000-s; i++) {
            Random random = new Random();
            String result = "uyihnb";
            map.computeIfAbsent(random.nextInt(78, 5129+1), k -> result);
        }

        map.forEach((k,v) -> System.out.println("key: " + k + ", value: " + v));

    }
}
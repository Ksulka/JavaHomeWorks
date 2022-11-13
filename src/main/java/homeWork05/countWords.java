package homeWork05;

import java.util.HashMap;
import java.util.Map;

public class countWords {
    public static void main(String[] args) {
        String[] words1 = new String[]{"b","bb","bbb"};
        String[] words2 = new String[] {"b","a","a","ab"};
        System.out.println(countSingleWords(words1, words2));
    }

    public static int countSingleWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        for (String i : words1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (String i : words2) {
            if (map.containsKey(i)) {
                int temp = map.get(i);
                if (temp > 1) continue;
                map.put(i, map.get(i) - 1);
            }
        }
        int count = 0;
        for (String i : map.keySet()) {
            if (map.get(i) == 0) count++;
        }
        return count;
    }
}


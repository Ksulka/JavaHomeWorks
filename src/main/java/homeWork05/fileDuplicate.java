package homeWork05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fileDuplicate {
    public static void main(String[] args) {
        String[] path = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(findDuplicate(path));
    }
    public static List<List<String>> findDuplicate(String[] paths) {

        List<List<String>> result = new ArrayList<>();

        if (paths.length == 0) {
            return result;
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String path : paths) {
            String[] strings = path.split(" ");
            String directory = strings[0];

            for (int i = 1; i < strings.length; i++) {
                int index = strings[i].indexOf("(");
                String content = strings[i].substring(index);
                String filename = directory + "/" + strings[i].substring(0, index);
                List<String> filenames = map.getOrDefault(content, new ArrayList<>());
                filenames.add(filename);
                map.put(content, filenames);
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                result.add(map.get(key));
            }
        }

        return result;
    }
}

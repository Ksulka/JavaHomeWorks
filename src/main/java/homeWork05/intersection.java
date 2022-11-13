package homeWork05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class intersection {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return new int[0];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
        }
        List<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 0) {
                resultArr.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] result = new int[resultArr.size()];
        int j = 0;
        for (int num : resultArr) {
            result[j] = num;
            j++;
        }
        return result;
    }
}

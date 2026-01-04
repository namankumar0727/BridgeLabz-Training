package com.hashmapandhashfunc.findsubarrays;
import java.util.*;

class ZeroSumSubarrays {

    public static void findAllZeroSumSubarrays(int[] arr) {

        // Map: prefixSum -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int prefixSum = 0;

        // To handle subarray starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {
                // Zero-sum subarray found
                for (int startIndex : map.get(prefixSum)) {
                    System.out.println(
                        "Zero-sum subarray found from index " +
                        (startIndex + 1) + " to " + i
                    );
                }
            }

            // Store current index for this prefixSum
            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }
    }
}

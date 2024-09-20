package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int left = -1;
        int right = -1;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                left = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                right = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{left, right};
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static int maxLen(String s) {

        int[] lastIndex = new int[128];

        Arrays.fill(lastIndex, -1);

        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            start = Math.max(start, lastIndex[c] + 1);

            maxLen = Math.max(maxLen, i - start + 1);

            lastIndex[c] = i;
        }
        return maxLen;
    }
}

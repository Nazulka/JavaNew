package DMJava.Session2;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};  // Example input
        System.out.println(findMajorityElement(nums));
    }

    public static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return Integer.MIN_VALUE;  // Should never happen since majority element is guaranteed
    }


    // Solution 2  - very efficient
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = -1;
        for (int num : nums) {
            // if count of the current candidate number became 0
            // then pick a new candidate
            if (count == 0) candidate = num;

            // if current number is the candidate  number
            // increase count by 1;
            if (num == candidate) count++;
            // otherwise, decrement count by 1. You can think of it like a single
            // non-candidate number cancels a single candidate
            else count--;
        }
        // since there is one number appears >n/2 times, it is non-cancellable
        // hence, it should be the last remaining
        return candidate;
    }
}

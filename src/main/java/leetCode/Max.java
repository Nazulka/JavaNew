import java.util.Arrays;

// leetcode 1913
public int Max(int[] nums) {
    int n  = nums.length;
    for (int i=0; i<n; i++) {
        for (int j=n-1; j>i; j--) {
            if (nums[j-1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
    }
    return (nums[n-2] * nums[n-1]) - (nums[0]* nums[1]);
}

public int maxProductDifference(int[] nums) {
    int ans =0;
    int n = nums.length;
    Arrays.sort(nums);
    return(nums[n-2]*nums[n-1])-(nums[0]*nums[1]);
}

public void main() {
}
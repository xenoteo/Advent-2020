package xenoteo.com.github.day1.part1;

import java.util.Arrays;

/**
 * Class finding the two entries that sum to x and then multiplying those two numbers together.
 */
public class Solution {

    /**
     * Finds the multiplication of two entries that sum to x.
     *
     * Sorts an array and uses two pointers (one from the beginning and another one from the end of an array)
     * moving them to find the right sum.
     *
     * Complexity is O(N * log(N)), where N is a number of elements in an array.
     *
     * @param nums  an input array
     * @param x  a desired sum
     * @return the multiplication of two numbers from an array that sum to x
     */
    public int multiplyRightPair(int[] nums, int x){
        Arrays.sort(nums);     // O(n * log(n))
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == x)
                return nums[left] * nums[right];
            else if (sum < x)
                left++;
            else
                right--;
        }
        return 0;
    }
}

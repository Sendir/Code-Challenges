/*
Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.

 

Example 1:

Input: nums = [-4,-2,1,4,8]
Output: 1
Explanation:
The distance from -4 to 0 is |-4| = 4.
The distance from -2 to 0 is |-2| = 2.
The distance from 1 to 0 is |1| = 1.
The distance from 4 to 0 is |4| = 4.
The distance from 8 to 0 is |8| = 8.
Thus, the closest number to 0 in the array is 1.

Example 2:

Input: nums = [2,-1,1]
Output: 1
Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.

 

Constraints:

    1 <= n <= 1000
    -105 <= nums[i] <= 105


*/

class Solution {
    public static void main(String[] args) {
    int test[] = {-10,-12,-54,-12,-544,-10000};

    System.out.println(findClosestNumber(test));
    }
    
        public static int findClosestNumber(int[] nums) {
        int result = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] <= Math.abs(result) && nums[i] >= 0)
            {
                result = nums[i];
            }
            else if(nums[i] < 0 && Math.abs(nums[i]) < Math.abs(result))
            {
                result = nums[i];
            }
        }
        return result;
    }
}
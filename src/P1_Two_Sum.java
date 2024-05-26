import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//        Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
//
//
//Constraints:
//
//        2 <= nums.length <= 104
//        -109 <= nums[i] <= 109
//        -109 <= target <= 109
//Only one valid answer exists.
public class P1_Two_Sum {

    public static void main(String[] args){
        int[] arr = new int[] {5,5};
    }
    // Brute Force, O(N^2)
    static public int[] twoSumBrute(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }

    // Using hastable to achieve O(N)
    static public int[] hashTwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        // value is the key and index is the value for map

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(i, nums[i]);
        }

        return new int[] {};
    }
}

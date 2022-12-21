/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * You can return the answer in any order.
 * */
package leetcode;
import java.util.HashMap;
import java.util.Map;

public class addNumberToArray {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2]; // Takes two integers

		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				result[0] = i;
				result[1] = map.get(nums[i]);
				System.out.println(result[1]);
			} else {
				map.put(target - nums[i], i);
			}
		}
		return result;
	}
	public static <Solution> void main(String[] args){
		int [] nums = {2, 7, 11, 15};
		int target = 9;
		twoSum(nums, target);
	}
}

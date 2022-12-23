package leetcode;

public class removeElement {
	public static int removeInt(int[] nums, int val){
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val){
				nums[count++] = nums[i];
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] numberArray = {3, 2, 2, 3};
		int removeElements = 3;
		System.out.println(removeInt(numberArray, removeElements));
	}
}
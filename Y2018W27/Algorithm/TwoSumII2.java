class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0, j = len - 1; i < j; ) {
            if (nums[i] + nums[j] == target) {
                return new int[] {i+1, j+1};
            } else if (nums[i] + nums[j] > target) {
                j --;
            } else {
                i ++;
            }
        }
        return null;
    }
}

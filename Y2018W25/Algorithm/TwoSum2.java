class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> set = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i ++) {
            if (set.containsKey(target - nums[i])) {
                result[0] = set.get(target-nums[i]);
                result[1] = i;
                break;
            }
            set.put(nums[i], i);
        }
        return result;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] origin = new int [len];
        System.arraycopy(nums, 0, origin, 0, len);
        Arrays.sort(nums);

        int a = 0, b = 0;
        for (int i = 0, j = len - 1; i < j; ) {
            if (nums[i] + nums[j] == target) {
                a = nums[i];
                b = nums[j];
                break;
            } else if (nums[i] + nums[j] > target) {
                j --;
            } else {
                i ++;
            }
        }

        int[] result = new int[2];
        for (int i = 0; i < len; i++) {
            if (a == origin[i]) {
                result[0] = i;
                break;
            }
        }
        for (int i = 0; i < len; i++) {
            if (b == origin[i]) {
                if (i == result[0]) {
                    continue;
                }
                result[1] = i;
                break;
            }
        }
        return result;
    }
}

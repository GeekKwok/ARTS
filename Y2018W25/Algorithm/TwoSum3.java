class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] indexs = new int [len];
        // it's inefficient when the test set is large
        for (int i = 0; i < len; i ++) {
            indexs[i] = i;
        }
        quickSort(nums, indexs, 0, len - 1);

        for (int i = 0, j = len - 1; i < j; ) {
            if (nums[i] + nums[j] == target) {
                return new int[] {indexs[i], indexs[j]};
            } else if (nums[i] + nums[j] > target) {
                j --;
            } else {
                i ++;
            }
        }
        return null;
    }

    private void quickSort(int[] nums, int[] indexs, int left, int right) {
        if (left < right) {
            int i = left, j = right, mid = nums[left], imid = indexs[left];
            while (i < j) {
                while (i < j && nums[j] >= mid) {
                    j --;
                }
                if (i < j) {
                    nums[i] = nums[j];
                    indexs[i] = indexs[j];
                    i ++;
                }
                while (i < j && nums[i] <= mid) {
                    i ++;
                }
                if (i < j) {
                    nums[j] = nums[i];
                    indexs[j] = indexs[i];
                    j --;
                }
            }
            nums[i] = mid;
            indexs[i] = imid;
            quickSort(nums, indexs, left, i - 1);
            quickSort(nums, indexs, i + 1, right);
        }
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < len - 2; i ++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int lo = i + 1, hi = len - 1, target = nums[i];
            while (lo < hi) {
                if (nums[lo] + nums[hi] + target == 0) {
                    List<Integer> res = new ArrayList<Integer>();
                    res.add(nums[i]);
                    res.add(nums[lo]);
                    res.add(nums[hi]);
                    result.add(res);
                    while (lo < hi && nums[lo] == nums[lo+1]) {
                        lo ++;
                    }
                    lo ++;
                    while (lo < hi && nums[hi] == nums[hi-1]) {
                        hi --;
                    }
                    hi --;
                } else if (nums[lo] + nums[hi] + target > 0) {
                    hi --;
                } else {
                    lo ++;
                }
            }
        }
        return result;
    }
}

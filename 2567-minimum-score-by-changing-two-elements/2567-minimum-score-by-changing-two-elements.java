class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n<=3){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            ans = Math.min(ans, nums[n-3+i] - nums[i]);
        }
        return ans;
    }
}
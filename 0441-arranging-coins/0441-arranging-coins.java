class Solution {
    public int arrangeCoins(int n) {
        long low = 0 , high = n;
        int rows = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            long coins = mid*(mid+1)/2;
            if(coins <= n){
                rows = (int) mid;
            }
            if(coins > n) high = mid-1;
            else low = mid + 1;
        }
        return rows;
    }
}
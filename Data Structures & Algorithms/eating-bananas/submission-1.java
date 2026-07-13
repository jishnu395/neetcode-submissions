class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = 0;
        for(int bananas : piles) {
            max = Math.max(max, bananas);
        }
        int high = max;

        while(low <= high) {
            int mid = low + (high - low)/2;
            int hrs = 0;
            for(int bananas:piles) {
                hrs += (bananas + mid - 1) / mid;
            }
            if(hrs <= h) {
                high = mid - 1;
            }else{
                low=mid+1;
            }


        }
        return low;
    }
}

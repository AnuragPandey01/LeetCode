class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int[] range = getRange(weights);
        int low = range[0];
        int high = range[1];
        int ans = -1;
        while(low<=high){

            int mid = low +(high-low)/2;
            if(canShipWithLimit(mid,days,weights)){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int[] getRange(int[] arr){
        int max = arr[0];
        int sum = 0;
        for(int num: arr){
            max = Math.max(max,num);
            sum +=  num;
        }
        return new int[]{max,sum};
    }

    private static boolean canShipWithLimit(
        int limit,
        int daysLimit,
        int[] weights
    ){
        int reqDays = 0;
        int currWeightSum = 0;
        for(int num: weights){
            if(currWeightSum+num > limit){
                reqDays++;
                currWeightSum = 0;
            }
            currWeightSum += num;
        }

        if(currWeightSum != 0) reqDays++;

        return reqDays<=daysLimit;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int low = 0;
        int high = 0;
        int minLow = low;
        int minHigh = high;
        int currSum = 0;
        int ans = Integer.MAX_VALUE;

        while(high<arr.length){

            currSum += Math.abs(arr[high]-x);
            while(high-low+1 > k){
                currSum -= Math.abs(arr[low]-x);
                low++;
            }
            if(high-low+1 == k && ans > currSum){
                ans = currSum;
                minLow = low;
                minHigh = high;
            }
            high++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = minLow; i<=minHigh;i++){
            list.add(arr[i]);
        }
        return list;
    }
}
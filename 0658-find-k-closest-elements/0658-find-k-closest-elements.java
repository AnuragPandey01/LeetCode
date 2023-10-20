class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        /* 
         * Intuition: array having the closest elements will have minimum sum of absolute difference
         */
        int low = 0;
        int high = 0;
        int ansStart = low;
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
                ansStart = low;
            }
            high++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = ansStart; i<ansStart+k;i++){
            list.add(arr[i]);
        }
        return list;
    }
}
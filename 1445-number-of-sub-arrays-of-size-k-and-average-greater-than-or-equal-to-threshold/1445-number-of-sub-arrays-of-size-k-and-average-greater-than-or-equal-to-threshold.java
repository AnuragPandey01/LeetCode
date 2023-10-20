class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = 0;
        int currentSum = 0;
        int counter = 0;

        while(j<arr.length){

            currentSum += arr[j];

            while(j-i+1 > k){
                currentSum -= arr[i++];
            }
            if(currentSum/k >= threshold && j-i+1 == k) counter++;
            j++;
        }
        return counter;
    }
}
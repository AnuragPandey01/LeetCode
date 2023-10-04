class Solution {
    public boolean winnerOfGame(String colors) { 

        int len = colors.length();
        int sumA =0;
        int sumB =0;
        int countA = 0;
        int countB = 0;

        for(int i=0;i<len;i++){
            if(colors.charAt(i) == 'A'){
                if(countB > 2){
                    sumB += countB-2;
                }
                countB = 0;
                countA++;
            }else{
                if(countA > 2){
                    sumA += countA-2;
                }
                countA = 0;
                countB++;
            }
        }

        if(countA > 2){
            sumA += countA-2;
        }
        if(countB > 2){
            sumB += countB-2;
        }

        return sumA>sumB;

    }
}
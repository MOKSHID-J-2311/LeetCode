class Solution {
    public int findMaxConsecutiveOnes(int[] num) {
     
        int max=0;
                    int count =0;
        for(int i=0; i<num.length;i++){

            if(num[i]==1){
            count++;}
            else{
                max=Math.max(max,count);
                count=0;

            }
                                    max=Math.max(max,count);


}

return max;
        
    }
}
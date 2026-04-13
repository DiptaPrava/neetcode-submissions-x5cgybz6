class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n*2];
        int k = 0;

        for(int i = 0; i<2; i++){
            for(int j = 0; j<nums.length; j++){
                int num = nums[j] ;
                ans[k++] = num;
            }
       

        }
        return ans;

    }
}
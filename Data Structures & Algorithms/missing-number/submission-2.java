class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int add=0;
        for(int a:nums){
            add+=a;

        }
        return sum-add;
        
    }
}

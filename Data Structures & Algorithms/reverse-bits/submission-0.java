class Solution {
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            int lst=n&1;
            ans=ans*2+lst;
            n=n>>1;

        }
        return ans;
        
    }
}

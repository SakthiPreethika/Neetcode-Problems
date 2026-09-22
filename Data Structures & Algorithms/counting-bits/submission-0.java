class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            int num=i;
            int count=0;
            while(num!=0){

                int rem=num%2;
                if(rem==1){
                    count++;
                }
                num=num/2;
            }
            ans[i]=count;
        }
        return ans;
        
    }
}

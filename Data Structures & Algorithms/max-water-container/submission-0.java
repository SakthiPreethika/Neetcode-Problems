class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int ans=0;
        while(left<right){
            int index=right-left;
            int high=Math.min(heights[left],heights[right]);
            int area=index*high;
            ans=Math.max(ans,area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
        
    }
}

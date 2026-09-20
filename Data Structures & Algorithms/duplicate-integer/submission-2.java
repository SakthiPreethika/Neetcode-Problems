class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                return true;
            }
        }
        return false;
        
    }
}
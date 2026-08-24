class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backTrack(nums,target,0, new ArrayList<>(),result);
        return result;
        
    }
    public void backTrack(int[] nums,int target,int start,List<Integer> curr,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i]>target){
                continue;
            }
            curr.add(nums[i]);
            backTrack(nums,target-nums[i],i,curr,result);
            curr.remove(curr.size()-1);
        }

    }
}

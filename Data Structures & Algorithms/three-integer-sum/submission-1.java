class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();

        int n=nums.length;
        for(int i=0;i<n-2;i++){
            HashSet<Integer> seen=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int need=-(nums[i]+nums[j]);
                if(seen.contains(need)){
                     List<Integer> list=Arrays.asList(nums[i],nums[j],need);

                
                    
                       

                    
                    Collections.sort(list);
                    set.add(list);
                }
                seen.add(nums[j]);
             }
                
            }
            a.addAll(set);
        return a;
        }
        
        
    }


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        int pos=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        while(pos<k){
            int element=0;
            int max=0;
            for(int a:map.keySet()){
                if(map.get(a)>max){
                    max=map.get(a);
                    element=a;
                }
                
            }
            ans[pos]=element;
            pos++;
            map.remove(element);
        }
        return ans;
        
    }
}

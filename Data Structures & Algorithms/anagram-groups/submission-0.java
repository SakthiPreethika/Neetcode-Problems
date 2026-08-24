class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String a=new String(arr);
            if(!map.containsKey(a)){
                map.put(a,new ArrayList<>());

            }
            map.get(a).add(s);
            

            
        }
        return new ArrayList<>(map.values());
        
    }
}

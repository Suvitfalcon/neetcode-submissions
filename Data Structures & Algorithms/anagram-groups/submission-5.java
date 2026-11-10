class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> suvit = new HashMap<>();
        for(String s:strs){
            char[] cer=s.toCharArray();
            Arrays.sort(cer);
            String sort=new String(cer);
            suvit.putIfAbsent(sort,new ArrayList<>());
            suvit.get(sort).add(s);
        }
        return new ArrayList<>(suvit.values());
        
    }
}

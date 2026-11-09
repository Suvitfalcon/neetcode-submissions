class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> res =new HashMap<>();
        for(String s:strs){
            char[] charAr=s.toCharArray();
            Arrays.sort(charAr);
            String sort=new String(charAr);
            res.putIfAbsent(sort,new ArrayList<>());
            res.get(sort).add(s);

        }
        return new ArrayList<>(res.values());
        
    }
}

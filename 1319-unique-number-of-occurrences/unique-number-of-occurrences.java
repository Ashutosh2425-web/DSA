class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int frequency:map.values()){
            if(set.contains(frequency)){
                return false;
            }
            set.add(frequency);
        }
        return true;
    }
}
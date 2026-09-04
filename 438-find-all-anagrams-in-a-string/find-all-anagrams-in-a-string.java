class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> result=new ArrayList<>();

        if(s.length() < p.length()){
            return result;
        }

        int[] pfreq=new int[26];
        int[] wfreq=new int[26];

        for(int i=0;i<p.length();i++){
            pfreq[p.charAt(i)-'a']++;
        }

        for(int i=0;i<p.length();i++){
            wfreq[s.charAt(i)-'a']++;
        }

        for(int right=p.length();right < s.length();right++){

            if(matches(pfreq,wfreq)){
                result.add(right - p.length());
            }

            wfreq[s.charAt(right)-'a']++;

            int left=right-p.length();
            wfreq[s.charAt(left)-'a']--;
        
        }

            if(matches(pfreq,wfreq)){
                result.add(s.length()- p.length());
            }
            return result;
        }
        private boolean matches(int[] a,int[] b){
            for(int i=0;i<26;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
        return true; 
    }
}
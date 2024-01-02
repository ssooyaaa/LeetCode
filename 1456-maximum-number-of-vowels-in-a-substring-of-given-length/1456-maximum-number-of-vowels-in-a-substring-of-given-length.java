class Solution {
    public int maxVowels(String s, int k) {
        
        int max = 0;
        int count = 0;
        
        Set<Character> vowel = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        
        for(int i=0;i<s.length();i++){
            if(vowel.contains(s.charAt(i))) count++;
            
            if(i>=k){
                if(vowel.contains(s.charAt(i-k))) count--;
            }
               
            max = Math.max(count, max);
        }
               
        return max;
    }
}
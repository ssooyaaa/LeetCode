class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String> answer = new ArrayList<>();
        
        int[] check = new int[26];
        Arrays.fill(check, Integer.MAX_VALUE);
        
        for(String word:words){
            int[] count = new int[26];
            
            for(char c:word.toCharArray()) count[c-'a']++;
            
            for(int i=0;i<26;i++)
                check[i] = Math.min(check[i], count[i]);
        }
        
        for(char c='a';c<='z';c++){
            for(int i=0;i<check[c-'a'];i++){
                answer.add(String.valueOf(c));
            }
        }
        
        return answer;
    }
}
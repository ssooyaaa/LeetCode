class Solution {
    public String reverseVowels(String s) {
        
        List<Integer> listIdx = new ArrayList<>();
        List<Character> listChar = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'|| s.charAt(i) =='A' || s.charAt(i) =='E' || s.charAt(i) =='I' ||s.charAt(i) == 'O' || s.charAt(i) =='U'){
                listIdx.add(i);
                listChar.add(s.charAt(i));
            }
        }
        
        Collections.reverse(listChar);
        
        for(int i=0;i<listIdx.size();i++){
            int idx = listIdx.get(i);
            sb.replace(idx, idx+1, listChar.get(i).toString());
        }
        
        return sb.toString();
    }
}
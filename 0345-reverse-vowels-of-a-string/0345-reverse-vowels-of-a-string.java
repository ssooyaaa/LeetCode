class Solution {
    public String reverseVowels(String s) {
     
        int start = 0;
        int end = s.length()-1;
        
        List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        
        char[] arr = s.toCharArray();
        
        while(start<end){
            if(!list.contains(arr[start])) start++;
            if(!list.contains(arr[end])) end--;
            
            if(list.contains(arr[start])&&list.contains(arr[end])){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                start++;
                end--;
            }
        }
        
        return new String(arr);
    }
}
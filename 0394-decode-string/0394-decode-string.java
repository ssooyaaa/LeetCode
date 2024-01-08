class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> countSt = new Stack<>();
        Stack<StringBuilder> resultSt = new Stack<>();
        StringBuilder st = new StringBuilder();
        
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
                count = count*10 + (s.charAt(i)-'0');
            
            else if(s.charAt(i)=='['){
                countSt.push(count);
                resultSt.push(st);
                st = new StringBuilder();
                count = 0;
            }else if(s.charAt(i)==']'){
                StringBuilder temp = st;
                st = resultSt.pop();
                int times = countSt.pop();
                
                for(int j=0;j<times;j++){
                    st.append(temp);
                }
            }else{
                st.append(s.charAt(i));
            }
        }
        
        return st.toString();
        
    }
}
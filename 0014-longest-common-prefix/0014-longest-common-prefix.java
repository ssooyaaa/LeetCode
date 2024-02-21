class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null || strs.length==0)
            return "";
        
        String common = strs[0];
        
        int i=1;
        
        while(i<strs.length){
            while(strs[i].indexOf(common)!=0){
                common = common.substring(0, common.length()-1);
            }
            i++;
        }
        
        return common;
    }
}
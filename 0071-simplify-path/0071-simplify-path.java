class Solution {
    public String simplifyPath(String path) {
     
        String[] directory = path.split("/");
        
        List<String> list = new ArrayList<>();
        
        for(String dir : directory){
            if(dir.equals("..")){
                if(!list.isEmpty())
                    list.remove(list.size()-1);
            }else if(!dir.isEmpty() && !dir.equals("."))
                list.add(dir);
        }
        
        StringBuilder answer = new StringBuilder();
        for(String st : list){
            answer.append("/").append(st);
        }
        
        return answer.length()>1 ? answer.toString():"/";
    }
}
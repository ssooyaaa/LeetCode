import java.util.*;
import java.io.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int firstLen = word1.length();
        int secondLen = word2.length();
        
        StringBuilder sb = new StringBuilder();
        if(firstLen>=secondLen){
            for(int i=0;i<secondLen;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }

            for(int i=secondLen;i<firstLen;i++){
                sb.append(word1.charAt(i));
            }
        }else{
            for(int i=0;i<firstLen;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }

            for(int i=firstLen;i<secondLen;i++){
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
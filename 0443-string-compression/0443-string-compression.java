class Solution {
    public int compress(char[] chars) {
        
        if (chars.length <= 1) {
            return chars.length;
        }

        int writeIndex = 0;
        int anchor = 0;

        for (int readIndex = 0; readIndex < chars.length; readIndex++) {
            if (readIndex + 1 == chars.length || chars[readIndex] != chars[readIndex + 1]) {
                chars[writeIndex++] = chars[anchor];

                if (readIndex > anchor) {
                    for (char c : Integer.toString(readIndex - anchor + 1).toCharArray()) {
                        chars[writeIndex++] = c;
                    }
                }

                anchor = readIndex + 1;
            }
        }

        return writeIndex;
    }
}
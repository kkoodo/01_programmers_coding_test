import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] arr = letter.split(" ");
        String answer = "";
        Map<String, String> morse = new HashMap<String, String>() {
            {
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z"); 
            }
        };
        
        for(int i = 0; i < arr.length; i++) {
            for(String key : morse.keySet()) {
                if(arr[i].equals(key)) {
                    answer += morse.get(key);
                }
            }
        }
        
        return answer;
        // for(String key : arr) {
        //     answer += morse.get(key);
        // }
    }
}
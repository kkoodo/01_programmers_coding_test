// import java.util.*;
// import java.util.stream.*;

class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < rsp.length(); i++) {
            switch(rsp.charAt(i)) {
                case '2' : answer.append("0");
                    break;
                case '0' : answer.append("5");
                    break;
                case '5' : answer.append("2");
                    break;
            }
        }
        return answer.toString();
        // return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}
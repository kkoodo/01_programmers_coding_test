class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("a|e|i|o|u", "");
        // return my_string.replaceAll("[aeiou]", "");
        // my_string.matches(".*[aeiou]+.*");
    }
}
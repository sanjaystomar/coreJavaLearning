package problemsolving.supereasy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Explanation:
 * The character 'l' at index 0 is the first character that does not occur at any other index.
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 * Constraints:
 * 1 <= s.length <= 105
 * s consists of only lowercase English letters.
 */
public class FirstUniqueCharInStr {
    
    static void main() {
        String sample1 = "leetcode";
        String sample2 = "loveleetcode";
        String sample3 = "aabb";
//        System.out.println(solution(sample3));
        System.out.println(betterSolution(sample2));
        
    }
    
    /**
     * costly solution ==> not good
     * find first non-repeating char in string
     * @param string
     * @return
     */
    static int solution(String string) {
        char[] charArray = string.toCharArray();
        Map<String, Integer> countingMap = new LinkedHashMap<>();
        for (char c : charArray){
            String charStr = String.valueOf(c);
            if(countingMap.containsKey(charStr)){
                countingMap.put(charStr,countingMap.get((charStr))+1);
            } else {
                countingMap.put(charStr, 1);
            }
        }
        
        
        Optional<String> first = countingMap.entrySet()
                                            .stream()
                                            .filter(e -> e.getValue() == 1)
                                            .map(onlyUnique -> onlyUnique.getKey())
                                            .findFirst();
        return string.indexOf(first.orElse( "?"));
    }
    
    public static int betterSolution(String s) {
        int[] countArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countArr[s.charAt(i)-'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if(countArr[s.charAt(i) -'a'] == 1) return i;
        }
        return -1;
    }
    
}
/**
 * kya baat system ko hee haywire kardo :)
 * class Solution {
 *     static{
 *     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
 *             try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
 *                 fw.write("0");
 *             } catch (Exception e) {
 *             }
 *         }));
 *     }
 *     public int firstUniqChar(String s) {
 *         for(int i=0;i<s.length();i++){
 *             boolean b=true;
 *             for(int j=0;j<s.length();j++){
 *                 if(i!=j && s.charAt(i)==s.charAt(j)){
 *                     b=false;
 *                     break;
 *                 }
 *             }
 *             if(b)
 *             return i;
 *         }
 *         return -1;
 *     }
 *
 * }
 */


/**
 * EXPLANATION OF THE BEST FEASIBLE APPROACH:
 * The firstUniqChar method aims to find the index of the first non-repeating character in a given string s. If no such character exists, it returns -1.
 * Here's a breakdown of the code:
 * int[] count = new int[26];
 * An integer array named count of size 26 is initialized. This array will be used to store the frequency of each lowercase English letter (a-z). Since there are 26 lowercase letters, an array of size 26 is sufficient.
 * for (char c : s.toCharArray()) { count[c - 'a']++; }
 * This is the first loop, which iterates through each character c in the input string s after converting it into a character array using s.toCharArray().
 * c - 'a': This is a clever trick to map each lowercase letter to an index in the count array.
 * For 'a', 'a' - 'a' = 0.
 * For 'b', 'b' - 'a' = 1.
 * ...
 * For 'z', 'z' - 'a' = 25.
 * count[c - 'a']++;: For each character encountered, its corresponding count in the count array is incremented. This effectively builds a frequency map for all characters in the string.
 * for (int i = 0; i < s.length(); i++) { if (count[s.charAt(i) - 'a'] == 1) { return i; } }
 * This is the second loop, which iterates through the input string s again, this time using an index i from 0 to s.length() - 1.
 * s.charAt(i): This gets the character at the current index i.
 * count[s.charAt(i) - 'a'] == 1: It checks the frequency of the current character (obtained using the same c - 'a' mapping) in the count array. If the frequency is 1, it means this character appeared only once in the entire string.
 * return i;: If a character with a frequency of 1 is found, its index i is immediately returned, as this is the "first" unique character.
 * return -1;
 * If the second loop completes without finding any character with a frequency of 1 (meaning all characters appear more than once or the string is empty), the method returns -1.
 * In summary, the algorithm works in two passes:
 * The first pass calculates the frequency of each character.
 * The second pass iterates through the string again to find the first character whose frequency is 1
 */

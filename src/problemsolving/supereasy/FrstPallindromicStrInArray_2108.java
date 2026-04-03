package problemsolving.supereasy;

/**
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
 * A string is palindromic if it reads the same forward and backward.
 * <p>
 * Example 1:
 * Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.
 * <p>
 * Example 2:
 * Input: words = ["notapalindrome","racecar"]
 * Output: "racecar"
 * Explanation: The first and only string that is palindromic is "racecar".
 * <p>
 * Example 3:
 * Input: words = ["def","ghi"]
 * Output: ""
 * Explanation: There are no palindromic strings, so the empty string is returned.
 * <p>
 * Constraints:
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consists only of lowercase English letters.
 */
public class FrstPallindromicStrInArray_2108 {
    static void main() {
        String[] words1 = new String[]{"abc", "car", "ada", "racecar", "cool"};
        String[] words2 = new String[]{"notapalindrome", "racecar"};
        String[] words3 = new String[]{"def", "ghi"};
        System.out.println(solution(words3));
    }
    
    static String solution(String[] words) {
        for (String wrd : words) {
            if (isPallindrome(wrd)) {
                return wrd;
            }
        }
        return "";
    }
    
    static boolean isPallindrome(String wrd) {
        for (int i = 0; i < wrd.length(); i++) {
            if (wrd.charAt(i) != wrd.charAt(wrd.length()-1 - i)) {
//                    if (wrd.length() % 2 == 0 && wrd.length() - i - i == 1)
                return false;
            }
        }
        return true;
    }
    
}

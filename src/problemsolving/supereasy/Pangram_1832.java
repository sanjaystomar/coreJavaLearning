package problemsolving.supereasy;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 * Example 1:
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 *
 *  Example 2:
 * Input: sentence = "leetcode"
 * Output: false
 *
 * Constraints:
 * 1 <= sentence.length <= 1000
 * sentence consists of lowercase English letters.
 */
public class Pangram_1832 {
    
    static void main() {
//        System.out.println(solution("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(solution("leetcode"));
    }
    static  boolean solution(String sentence){
        int[] alphabetArray = new int[26];
        
        for (Character ch : sentence.toCharArray()) {
            alphabetArray[ch - 'a'] = 1;
        }
        
        for (int n : alphabetArray) {
            if (n!=1) return false;
        }
        return true;
    }
}

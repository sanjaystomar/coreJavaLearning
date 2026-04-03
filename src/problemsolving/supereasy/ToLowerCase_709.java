package problemsolving.supereasy;

/**
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 * Example 1:
 * Input: s = "Hello"
 * Output: "hello"
 *
 * Example 2:
 * Input: s = "here"
 * Output: "here"
 *
 *  Example 3:
 * Input: s = "here"
 * Output: "lovely"
 *
 * Constraints:
 * 1 <= s.length <= 100
 * s consists of printable ASCII characters.
 */
public class ToLowerCase_709 {
    static void main() {
        System.out.println(solution("Hello"));
        System.out.println(solution("here"));
        System.out.println(solution("LOVELY"));
    }
    
    /**
     * Lowercase "a-z" ASCII Table (97-122)
     * Uppercase "A-Z" ASCII Table (65-90)
     */
    static String solution(String s) {
        char[] oldArr = s.toCharArray();
        for(int i=0; i<oldArr.length;i++){
            int charAtI = s.charAt(i);
            if (charAtI >=65 && charAtI <= 90){
                oldArr[i]=(char) (charAtI - 'A' + 97);
            }
        }
        return String.copyValueOf(oldArr);
    }
}


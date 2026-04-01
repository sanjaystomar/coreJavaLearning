package datastructures.recursion;

public class RecursionExample3MatchingBraces {
    static void main() {
        System.out.println(matchBracesRecursive("(())(()))", 0));
        System.out.println(matchBracesRecursive("()", 0));
    }
    
    public static boolean matchBracesRecursive(String braceStr, int count){
        if(braceStr.length()==0)
            return count==0;
        if(braceStr.charAt(0)== '(')
            count++;
        else
            count--;
        return matchBracesRecursive(braceStr.substring(1), count);
    }
}

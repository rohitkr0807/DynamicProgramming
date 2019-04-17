package HardProblems;

/*
Added By Rohit
Given a string, a partitioning of the string is a palindrome partitioning if every
substring of the partition is a palindrome.
For example, “aba|b|bbabb|a|b|aba” is a palindrome
partitioning of “ababbbabbababa”.
Determine the fewest cuts needed for palindrome partitioning of a given string.
For example, minimum 3 cuts are needed for “ababbbabbababa”.
The three cuts are “a|babbbab|b|ababa”.
If a string is palindrome, then minimum 0 cuts are needed.
If a string of length n containing all different characters,
then minimum n-1 cuts are needed.
palindrome-partitioning

 */
public class PalindromePartioning {
    public static void main(String[] args) {
        String str = "aheheha";
        System.out.println(isPalindrome(str, 0, str.length() - 1));

    }

    public static int minCutNeededForPartition(String str) {
        int n = str.length();
        int[][] c = new int[n][n];  //Minimum cut Needed
        boolean[][] p = new boolean[n][n];
        for (int i = 0; i < str.length(); i++) {
            p[i][i] = true;
            c[i][i] = 0;
        }
        for (int L = 2; L <= n; L++) {
            for (int i = 0; i < n - L + 1; i++) {
                int j = i + L - 1;
                if (L == 2) {
                    p[i][j] = (str.charAt(i) == str.charAt(j));
                } else p[i][j] = (str.charAt(i) == str.charAt(j) && p[i + 1][j - 1]);

                if (p[i][j] == true) {
                    c[i][j] = 0;
                } else {
                    c[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k <= j - 1; k++)
                        c[i][j] = Integer.min(c[i][j],
                                c[i][k] + c[k + 1][j] + 1);

                }
            }

        }


        return c[0][n - 1];
    }

    public static boolean isPalindrome(String str, int start, int last) {
        if (str.length() == 0) {
            return true;
        }
        if (str.charAt(start) != str.charAt(last)) {
            return false;
        }
        if (start < last)
            return isPalindrome(str, start + 1, last - 1);

        return true;
    }

}

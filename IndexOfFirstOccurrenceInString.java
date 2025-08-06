public class IndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack="adnutsad";
        String needle="sad";
        System.out.println(checkOccurrenceIndex(haystack,needle));
    }
    public static int checkOccurrenceIndex(String haystack,String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0)
            return 0;
        else {
            for (int i = 0; i < n - m; i++) {
                int j = 0;
                while (j < m && haystack.charAt(i + j) == needle.charAt(j))
                    j++;
                if (j == m)
                    return i;
            }
            return -1;
        }
    }
}

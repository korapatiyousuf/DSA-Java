package Problems.Strings;

import java.util.Objects;

public class ReverseStringWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        int n = words.length;
        StringBuilder sb = new StringBuilder();
        sb.append(words[n-1]);
        for(int i=n-2;i>=0;i--) {
            if(words[i] != " " || words[i] != "") {
                sb.append(" ");
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "  hello world  ";
                //"a good   example";
        System.out.println(reverseWords(str));
    }
}

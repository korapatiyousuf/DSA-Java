package Problems.Algorithms.RecursionAndBacktracking.Recursion;

import java.util.List;
import java.util.ArrayList;

public class GenerateBinaryStrings {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> binaryStringList = new ArrayList<>();
        return generate(n, "", binaryStringList);
    }

    public static List<String> generate(int remLen, String str, List<String> binaryStringList) {
        if(remLen == 0) {
            binaryStringList.add(str);
            return binaryStringList;
        }

        if(str.isEmpty() || str.charAt(str.length()-1) == '0') {
            //add zero to string
            generate(remLen-1, str+"0", binaryStringList);

            //add one to string
            generate(remLen-1, str+"1", binaryStringList);
        }

        else {
            //add zero to string
            generate(remLen-1, str+"0", binaryStringList);
        }

        return binaryStringList;
    }
}

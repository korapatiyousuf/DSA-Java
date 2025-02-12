package Problems.Algorithms.RecursionAndBacktracking.Recursion;

import java.util.List;
import java.util.ArrayList;

//Leetcode 22. Generate Parentheses
public class GenerateParenthesis {
    List<String> parenthList = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(n, 0, 0, "");
        return parenthList;
    }

    public void generate(int n, int openCount, int closeCount, String str) {
        //base case
        if(openCount < closeCount || openCount > n || closeCount > n) {
            return;
        }

        if(openCount == n && closeCount == n) {
            parenthList.add(str);
            return;
        }

        //recursive call for '('
        generate(n, openCount+1, closeCount, str+"(");

        //recursive call for ')'
        generate(n, openCount, closeCount+1, str+")");
    }
}

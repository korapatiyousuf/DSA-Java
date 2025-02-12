package Algorithms.BackTracking;

import java.util.ArrayList;

//Rat in a maze 4 directions(i.e., down, up, right, left) with no restrictions
public class RatInMazeBacktrack {
    ArrayList<String> pathsList = new ArrayList<>();
    int endRow, endCol;
    public void ratInMazePaths(int currRow, int currCol, boolean[][] isRatVisited, String path) {
        //base case to break recursion
        //if rat reached beyond the maze rows/cols when recursion calls are made
        if(currRow < 0 || currRow > endRow || currCol < 0||  currCol > endCol) {
            return;
        }

        //if rat reached the goal
        if(currRow == endRow && currCol == endCol) {
            pathsList.add(path);
            return ;
        }

        if(isRatVisited[currRow][currCol]) {
            return;
        }

        isRatVisited[currRow][currCol] = true;

        //move down -> row+1
        ratInMazePaths(currRow+1, currCol, isRatVisited, path+"D");

        //move up -> row-1
        ratInMazePaths(currRow-1, currCol, isRatVisited, path+"U");

        //move right -> col+1
        ratInMazePaths(currRow, currCol+1, isRatVisited, path+"R");

        //move left -> col-1
        ratInMazePaths(currRow, currCol-1, isRatVisited, path+"L");

        //backtrack
        isRatVisited[currRow][currCol] = false;
    }

    public static void main(String[] args) {
        RatInMazeBacktrack rat = new RatInMazeBacktrack();
        rat.endRow = rat.endCol = 2;
        rat.ratInMazePaths(0,0,new boolean[rat.endRow+1][rat.endCol+1],"");
        System.out.println(rat.pathsList);
    }
}

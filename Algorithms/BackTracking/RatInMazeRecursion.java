package Algorithms.BackTracking;
import java.util.ArrayList;

//Rat in a maze 2 directions (i.e., down and right) with no restrictions

public class RatInMazeRecursion {
    int endRow, endCol;
    public ArrayList<String>  mazePaths(int currRow, int currCol, String path, ArrayList<String> pathList) {
        //base case to break recursion
        //rat will move beyond the maze row/col while recursion calls are made
        if(currRow > endRow || currCol > endCol) {
            return pathList;
        }

        //when goal is reached
        if(currRow == endRow && currCol == endCol) {
            pathList.add(path);
            return pathList;
        }

        //move Down
        mazePaths(currRow+1, currCol, path+"D", pathList);

        //move Right
        mazePaths(currRow, currCol+1, path+"R", pathList);

        return pathList;
    }

    public static void main(String[] args) {
        RatInMazeRecursion rat = new RatInMazeRecursion();
        rat.endRow = rat.endCol = 2;
        ArrayList<String> pathsList = rat.mazePaths(0,0,"", new ArrayList<String>());

        System.out.println("Paths rat can travel to reach goal in a maze of " +(rat.endRow+1) +" X " +(rat.endCol+1) +" maze");
        System.out.println(pathsList);
    }

}

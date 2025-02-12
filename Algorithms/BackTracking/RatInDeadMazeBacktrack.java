package Algorithms.BackTracking;

import java.util.ArrayList;

//rat can move in all 4 directions(down, up, right and left)
// and the maze has blockages
public class RatInDeadMazeBacktrack {
    static int endRow, endCol;
    static ArrayList<String> mazePathsList = new ArrayList<>();
    public static void ratMazePaths(int currRow, int currCol, int[][] maze, String path) {
        //base case to break recursion calls
        if(currRow < 0 || currRow > endRow || currCol < 0 || currCol > endCol || maze[currRow][currCol] == 0 || maze[currRow][currCol] == -1) {
            return;
        }

        //if rat has reached the goal
        if(currRow == endRow && currCol == endCol) {
            mazePathsList.add(path);
            return;
        }
        maze[currRow][currCol] = -1;

        //move down -> row + 1
        ratMazePaths(currRow+1, currCol, maze, path+"D");

        //move up -> row - 1
        ratMazePaths(currRow-1, currCol, maze, path+"U");

        //move right -> col + 1
        ratMazePaths(currRow, currCol+1, maze,  path+"R");

        //move left -> col - 1
        ratMazePaths(currRow, currCol-1, maze,  path+"L");

        //backtrack
        maze[currRow][currCol] = 1;
    }

    public static void main(String[] args) {
        int[][] maze = {{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};
        endRow = maze.length-1;
        endCol = maze[0].length-1;
        ratMazePaths(0,0,maze, "");
        System.out.println(mazePathsList);
    }
}

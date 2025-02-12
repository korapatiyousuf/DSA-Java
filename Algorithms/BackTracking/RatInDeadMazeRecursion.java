package Algorithms.BackTracking;

import java.util.ArrayList;

//Rat can move in 2 directions(i.e., down and right)
//and the maze has blockages(rat cannot enter particular box in maze)

public class RatInDeadMazeRecursion {
    static int endRow, endCol;
    static ArrayList<String> mazePathsList = new ArrayList<>();
    public static void deadMazePaths(int currRow, int currCol, int[][] maze, String path){
        //base case for recursion to break flow
        if(currRow > endRow || currCol > endCol ) {
            return;
        }

        //if rat reached goal
        if(currRow == endRow && currCol == endCol) {
            mazePathsList.add(path);
            return;
        }

        if(maze[currRow][currCol] == 0) {
            return;
        }

        //move down -> row + 1
        deadMazePaths(currRow+1, currCol, maze, path+"D");

        //move right -> col + 1
        deadMazePaths(currRow, currCol+1, maze, path+"R");
    }

    public static void main(String[] args) {

        int[][] maze = {{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};
        endRow = maze.length-1;
        endCol = maze[0].length-1;

        deadMazePaths(0,0,maze,"");
        System.out.println(mazePathsList);

    }
}

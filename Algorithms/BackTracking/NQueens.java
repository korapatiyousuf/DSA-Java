package Algorithms.BackTracking;

import java.util.ArrayList;

public class NQueens {
    ArrayList<ArrayList<String>> queenBoard = new ArrayList<>();
    public void placeQueens(int row, char[][] board) {
        int n = board.length;
        //base case for recursion
        if(row == n) {
            //add board to output list
            ArrayList<String> placedBoard = new ArrayList<>();
            for(int i=0;i<n;i++) {
                String str = "";
                for(int j=0;j<n;j++) {
                    str += board[i][j];
                }
                placedBoard.add(str);
            }
            queenBoard.add(placedBoard);
            return;
        }
        for(int col=0;col<n;col++) {
            //check if a box is safe place to place a queen in board
            if(isSafePlace(board, row, col)){
                board[row][col] = 'Q';
                placeQueens(row+1, board);
                //backtrack
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafePlace(char[][] board, int row, int col) {
        int n = board.length;
        //check whole given row and col
        for(int i=0;i<n;i++) {
            if(board[i][col] == 'Q' || board[row][i] == 'Q') {
                return false;
            }
        }

        //check north-east
        int k = row-1, l = col+1;
        while(k>=0 && l < n) {
            if(board[k][l] == 'Q') {
                return false;
            }
            k--;
            l++;
        }

        //check north-west -> row-- && col --
        k = row-1;
        l = col-1;
        while(k>=0 && l>=0) {
            if(board[k][l] == 'Q') {
                return false;
            }
            k--;
            l--;
        }

        //check south-east -> row++, col++
        k=row+1;
        l=col+1;

        while(k<n && l<n) {
            if(board[k][l] == 'Q') {
                return false;
            }
            k++;
            l++;
        }


        //check south-west -> row++, col--
        k=row+1;
        l=col-1;
        while(k<n && l>=0) {
            if(board[k][l] == 'Q') {
                return false;
            }
            k++;
            l--;
        }
        return true;
    }

    public static void main(String[] args) {
        NQueens queens = new NQueens();
        char[][] board = {{'.','.','.','.'},
                          {'.','.','.','.'},
                          {'.','.','.','.'},
                          {'.','.','.','.'}};
        queens.placeQueens(0, board);
        for(int i=0;i<queens.queenBoard.size();i++) {
            System.out.println(queens.queenBoard.get(i));
        }
    }
}

import java.util.*;
public class MyProgram {
    static int[][] board = new int[9][9];
    
    public static void main(String[] args)
    {
        generateBoard(0, 0);
        printBoard();
    }
    public static boolean generateBoard(int row, int col) {
        if (row == 9) 
            return true;
    
        int nextCol = col + 1;
        int nextRow = row;
        if(nextCol == 9)
        {
            nextCol = 0;
            nextRow++;
        }

        int[] nums = {1,2,3,4,5,6,7,8,9};
        Shuffle(nums);

        for (int num : nums) {
            if (check(board, row, col, num)) {
                board[row][col] = num;
                if (generateBoard(nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean check(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) 
                return false;
            if (board[i][col] == num) 
                return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }
        return true;
    }

    public static void Shuffle(int[] x) {
        Random r = new Random();
        for (int i = x.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
        }
    }
    
    public static void printBoard() {
        for (int i = 0 ; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println("+-------+-------+-------+");
            }
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] +  " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }
    
}

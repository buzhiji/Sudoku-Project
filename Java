import java.util.*;
public class MyProgram {
    static int[][] board = new int[9][9];
    
    public static void main(String[] args)
    {
        generateBoard();
        printBoard();
    }
    public static void generateBoard() {
        int[] col = {1,2,3,4,5,6,7,8,9};
        Shuffle(col);
    
        int x = 0;
        for (int i = 0; i < 9; i ++)
        {
            for(int j = 0; j < 9; j++)
            {
                board[i][j] = col[(j + i*3 + i/3)%9];
            }
        }
    }
    
    public static void Shuffle(int[] x) {
        Random rand = new Random();
        for (int i = x.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
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

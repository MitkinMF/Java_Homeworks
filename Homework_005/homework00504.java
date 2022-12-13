//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class homework00504 {

    static int[] cheBoardTmp = { 0, 0, 0, 0, 0, 0, 0, 0 };
    static int[][] cheBoard = new int[8][8];
    static int index = 0;

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            if (checking()) {
                if (index == 7) {
                    printBoard();
                    flag = false;
                } else {
                    index++;
                }
            } else {
                cheBoardTmp[index]++;
            }
        }
    }

    static boolean checking() {

        if (index == 0) {
            return true;
        }

        if (cheBoardTmp[index] > 7) {
            cheBoardTmp[index] = 0;
            index--;
            return false;
        }

        for (int i = 0; i < index; i++) {
            if ((cheBoardTmp[index] == cheBoardTmp[i])
                    | (Math.abs(cheBoardTmp[index] - cheBoardTmp[i])) == (index - i)) {
                return false;
            }
        }

        return true;
    }

    static void printBoard() {
        for (int i = 0; i < cheBoardTmp.length; i++) {
            cheBoard[cheBoardTmp[i]][i] = 1;
        }
        for (int i = 0; i < cheBoard.length; i++) {
            for (int j = 0; j < cheBoard[i].length; j++) {
                if (cheBoard[i][j] == 1) {
                    System.out.print("Q  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
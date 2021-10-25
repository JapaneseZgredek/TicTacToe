public class Main {
    public static void main(String[] args){
        char [][] checkBoard = {{' ','|',' ','|',' '},
                                {'-','+','-','+','-'},
                                {' ','|',' ','|',' '},
                                {'-','+','-','+','-'},
                                {' ','|',' ','|',' '}};
        printCheckBoard(checkBoard);
        while(doWeHaveWinner(checkBoard)){
            
        }
    }
    static void printCheckBoard(char[][] checkBoard){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(checkBoard[i][j]);
            }
            System.out.println();
        }
    }
    static boolean doWeHaveWinner(char[][] checkboard){
        if( (checkboard[0][0] == 'X' && checkboard[0][2] == 'X' && checkboard [0][4] == 'X') ||
            (checkboard[2][0] == 'X' && checkboard[2][2] == 'X' && checkboard [2][4] == 'X') ||
            (checkboard[4][0] == 'X' && checkboard[4][2] == 'X' && checkboard [4][4] == 'X') ||
            (checkboard[0][0] == 'X' && checkboard[2][0] == 'X' && checkboard [4][0] == 'X') ||
            (checkboard[0][2] == 'X' && checkboard[2][2] == 'X' && checkboard [4][2] == 'X') ||
            (checkboard[0][4] == 'X' && checkboard[2][4] == 'X' && checkboard [4][4] == 'X') ||
            (checkboard[0][0] == 'X' && checkboard[2][2] == 'X' && checkboard [4][4] == 'X') ||
            (checkboard[0][4] == 'X' && checkboard[2][2] == 'X' && checkboard [4][0] == 'X'))
            return false;
        else if( (checkboard[0][0] == 'O' && checkboard[0][2] == 'O' && checkboard [0][4] == 'O') ||
                (checkboard[2][0] == 'O' && checkboard[2][2] == 'O' && checkboard [2][4] == 'O') ||
                (checkboard[4][0] == 'O' && checkboard[4][2] == 'O' && checkboard [4][4] == 'O') ||
                (checkboard[0][0] == 'O' && checkboard[2][0] == 'O' && checkboard [4][0] == 'O') ||
                (checkboard[0][2] == 'O' && checkboard[2][2] == 'O' && checkboard [4][2] == 'O') ||
                (checkboard[0][4] == 'O' && checkboard[2][4] == 'O' && checkboard [4][4] == 'O') ||
                (checkboard[0][0] == 'O' && checkboard[2][2] == 'O' && checkboard [4][4] == 'O') ||
                (checkboard[0][4] == 'O' && checkboard[2][2] == 'O' && checkboard [4][0] == 'O'))
            return false;
        else
            return true;
    }
}

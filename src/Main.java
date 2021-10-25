import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char [][] checkBoard = {{' ','|',' ','|',' '},
                                {'-','+','-','+','-'},
                                {' ','|',' ','|',' '},
                                {'-','+','-','+','-'},
                                {' ','|',' ','|',' '}};
        byte place;
        boolean error = false;
        Player player = new Player("Player 2", 'O');
        while(doWeHaveWinner(checkBoard)){
            printCheckBoard(checkBoard);
            didPlayerMakeMistake(error, player);
            System.out.println(player.name + " where do you want to place your mark?");
            place = scanner.nextByte();
            error = placingMark(place, player, checkBoard, error);

        }
        System.out.println("Congrats " + player.name + " you are the winner !!!");
    }
// ----------------------------------------------------------------------------------------------------------
    static void didPlayerMakeMistake(boolean error, Player player){
        if(!error)
            if(player.name == "Player 2"){
                player.name = "Player 1";
                player.OorX = 'X';
            }
            else {
                player.name = "Player 2";
                player.OorX = 'O';
            }
    }
// ----------------------------------------------------------------------------------------------------------
    static boolean placingMark(byte place, Player player, char[][] checkBoard, boolean error){
        switch (place){
            case 1:
                if(checkBoard[0][0] == ' ') {
                    checkBoard[0][0] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            case 2:
                if(checkBoard[0][2] == ' ') {
                    checkBoard[0][2] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            case 3:
                if(checkBoard[0][4] == ' ') {
                    checkBoard[0][4] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            case 4:
                if(checkBoard[2][0] == ' ') {
                    checkBoard[2][0] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            case 5:
                if(checkBoard[2][2] == ' ') {
                    checkBoard[2][2] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            case 6:
                if(checkBoard[2][4] == ' ') {
                    checkBoard[2][4] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            case 7:
                if(checkBoard[4][0] == ' ') {
                    checkBoard[4][0] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            case 8:
                if(checkBoard[4][2] == ' ') {
                    checkBoard[4][2] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            case 9:
                if(checkBoard[4][4] == ' ') {
                    checkBoard[4][4] = player.OorX;
                    error = false;
                }
                else {
                    System.out.println("This place is already taken try again");
                    error = true;
                }
                break;
            default:
                System.out.println("You can choose number only beetwen 1-9");
                break;
        }
        return error;
    }
// ----------------------------------------------------------------------------------------------------------
    static void printCheckBoard(char[][] checkBoard){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(checkBoard[i][j]);
            }
            System.out.println();
        }
    }
// ----------------------------------------------------------------------------------------------------------
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

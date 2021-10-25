public class Main {
    public static void main(String[] args){
        char [][] checkBoard = {{' ','|',' ','|',' '},
                                {'-','+','-','+','-'},
                                {' ','|',' ','|',' '},
                                {'-','+','-','+','-'},
                                {' ','|',' ','|',' '}};
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(checkBoard[i][j]);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class TicTocToe {

    public static void main(String[] args) {
       // System.out.println("Hello world!");

       //We need to 3 by 3 //so 2D array
       char[][] bord = new char[3][3];
       //row and col has empty
       for(int row=0; row<bord.length; row++){
       for(int col=0; col<bord.length; col++){
        bord[row][col] = ' '; //empty
       }
       }

       //now player A play woth x or 0  // first move one playr then seond move second player
       //any where played put our number in 9 box
       //Dignol is the wining situation

       char player = 'X'; //First player playing
       boolean  gameOver = false; //because my game is not over

       Scanner sc = new Scanner(System.in); //take input

       while(!gameOver){ //for Every move this loop
           print
       }
       
    }
    
}

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    int row , col ,size;
    int[][] map;
    int[][] board;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MayinTarlasi(int row , int col){
        this.row = row;
        this.col = col;
        this.map = new int[row][col];
        this.board = new int[row][col];
        this.size = row * col;
    }

    public void check(int r,int c){

    }


    public void run(){
        prepareGame();
        print(board);
        System.out.println("oyun basladi");

        while(true){
            System.out.println("row(satir giriniz: ");
            int tahminRow = scan.nextInt();
            System.out.println("col(sutun giriniz: ");
            int tahminCol = scan.nextInt();

            if(map[tahminRow][tahminCol] == -1){
                System.out.println("Mayina bastiniz kaybettiniz");
                break;
            }else{

            }


        }

    }

    public void prepareGame(){
        int randRow,randCol;
        int count = size / 4;

        while (count != 0){
            randRow = rand.nextInt(row);
            randCol = rand.nextInt(col);
            if (map[randRow][randCol] != -1 ){
                map[randRow][randCol] = -1;
                count--;
            }
        }
    }

    public void print(int[][] arr){
        for(int i=0 ; i < arr.length ; i++){
            for(int j=0 ; j < arr[0].length ; j++){

                if(arr[i][j] == 0) System.out.print(" ");

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }


}

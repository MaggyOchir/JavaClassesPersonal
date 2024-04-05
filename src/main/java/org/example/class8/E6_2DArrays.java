package org.example.class8;

public class E6_2DArrays {
    public static void main(String[] args) {
        int [] [] matrix= {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 120, 150}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                    System.out.print(matrix[i][j]+" ");}
            System.out.println();
        }
   }
}




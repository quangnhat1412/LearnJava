package december.chuong_03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AN515-45
 */
public class CuuChuong_for {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.println("Bang cuu chuong: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %2d\n",i,j,i*j);
            }
        }
    }
    
}

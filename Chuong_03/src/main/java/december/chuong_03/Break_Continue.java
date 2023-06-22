/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_03;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class Break_Continue {
    public static void main(String[] args) {
        int i ;
        float diem;
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Hay nhap diem: ");
            diem = s.nextFloat();
            if(diem >= 0 && diem <= 10 ){
                break;
            }
        }
        System.out.println("Diem vua nhap: " + diem);
        System.out.println("Ket thuc vong lap !");
    }
}

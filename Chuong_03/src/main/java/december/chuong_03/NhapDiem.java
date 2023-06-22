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
public class NhapDiem {
    public static void main(String[] args) {
        float diem, dem =0; 
        Scanner s = new Scanner(System.in);
        do{
            System.out.print("Hay nhap diem: ");
            diem = s.nextInt();
            dem ++;
        }while(diem < 0 || diem > 10 && dem < 3);
        if(diem > 10){
            System.out.println("Hay thu lai sau 5p");
            return;
        }
        System.out.println("Diem vua nhap: " + diem);
    }
    
}

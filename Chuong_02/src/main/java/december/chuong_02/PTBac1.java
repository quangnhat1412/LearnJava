/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_02;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class PTBac1 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("------ GIAI PHUONG TRINH BAC 1 -------");
        System.out.println("-- Phuong trinh co dang: ax + b = 0 --");
        System.out.println("--------------------------------------");
        
        int a,b;
        float x; 
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = s.nextInt();
        System.out.print("Nhap he so b: ");
        b = s.nextInt();
        
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            x = -(float)b / a;
            System.out.printf("Phuong trinh co nghiem: x=%.2f",x);
        }
        
    }
}

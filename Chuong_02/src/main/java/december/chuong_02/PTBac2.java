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
public class PTBac2 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("------ GIAI PHUONG TRINH BAC 2 -------");
        System.out.println("-- Phuong trinh co dang: ax*x + b*x + c = 0 --");
        System.out.println("--------------------------------------");
        
        int a,b,c,denlta;
        double x1,x2;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = s.nextInt();
        System.out.print("Nhap he so b: ");
        b = s.nextInt();
        System.out.print("Nhap he so c: ");
        c = s.nextInt();
        
        if(a==0){
            PTBac1(b, c);
        }
        else{
            denlta = b*b - 4*a*c;
            if(denlta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if(denlta == 0){
                x1 = -(double)b / (2*a);
                System.out.printf("Phuong trinh co nghiep kep: x = %.2f",x1);
            }
            if(denlta > 0){
                x1 = (-b + Math.sqrt(denlta)) / (2*a);
                x2 = (-b - Math.sqrt(denlta)) / (2*a);
                
                System.out.printf("Phuong trinh co 2 nghiep phan bieta: x1 = %.2f ; x2= %.2f",x1,x2);
            }
        }
    }
    
    public static void PTBac1(int a, int b){
          if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            float x = -(float)b / a;
            System.out.printf("Phuong trinh co nghiem: x=%.2f",x);
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_04;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class VD_02 {
    public static void main(String[] args) {
        double xA, xB, yA, yB, d;
        xA= NhapSo("Nhap hoang do x: ");
        yA= NhapSo("Nhap tung do x: ");
        xB= NhapSo("Nhap hoang do x: ");
        yB= NhapSo("Nhap tung do y: ");

        // Tinh khoang cach giua 2 diem A va B      
        d= TinhKC(xA,yA,xB,yB);
        System.out.println("Khoang cach giua 2 diem AB: "+d);
    }
    public static double NhapSo(String thongbao){
        Scanner s = new Scanner(System.in);
        double kq; 
        System.out.print(thongbao);
        kq= s.nextDouble();
        return kq;     
    }
    public static double TinhKC(double xA, double yA, double xB, double yB){
        double kq;
        double d1 = xB - xA;
        double d2 = yB - yA;
        kq = Math.sqrt(d1*d1 + d2*d2);
        return kq;
    }
    
}

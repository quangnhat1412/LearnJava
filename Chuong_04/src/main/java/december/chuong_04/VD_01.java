/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_04;

import java.util.Scanner;

/**
 *
 *
 */
public class VD_01 {
    public static void main(String[] args) {
        double xA, xB, yA, yB, d;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Nhap hoang do A: ");
        xA = s.nextDouble();
        System.out.print("Nhap tung do A: ");
        yA = s.nextDouble();
        System.out.print("Nhap hoang do B: ");
        xB = s.nextDouble();
        System.out.print("Nhap tung do B: ");
        yB = s.nextDouble();
        
        // Tinh khoang cach giua 2 diem A va B 
        double d1 = xB - xA;
        double d2 = yB - yA;
        d= Math.sqrt(d1*d1 + d2*d2);
        
        System.out.println("Khoang cach giua 2 diem AB: "+d);
        
        // Đây là 1 bài toàn thô sơ, dài dòng nhất ==> từ đố ta sử dụng lập trình hướng đối tượng để thực hiện
    }
}

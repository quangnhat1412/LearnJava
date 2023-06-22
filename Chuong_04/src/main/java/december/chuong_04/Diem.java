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
public class Diem {
    // Định nghĩa các biến thành phần 
    double x,y;
    
    // Định nghĩa các hàm thành phần
    public void Nhap(String d){
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap hoanh do %s: ", d);
        this.x = s.nextDouble();
        System.out.printf("Nhap tung do %s: ", d);
        this.y = s.nextDouble();
    }
    public void Xuat(String d){
        System.out.printf("Diem %s(%.2f;%.2f)\n",d, this.x, this.y); 
    }
    
    public double TinhKC(Diem B){
        double kq;
        double dx = this.x - B.x;
        double dy = this.y - B.y;
        kq = Math.sqrt(dx*dx + dy*dy);
        return kq;
    }
}

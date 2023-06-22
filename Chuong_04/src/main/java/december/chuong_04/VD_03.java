/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_04;

/**
 *
 * @author AN515-45
 */
public class VD_03 {
    public static void main(String[] args) {
        // Nhap diem
        Diem A = new Diem();
        A.Nhap("A");
        Diem B = new Diem();
        B.Nhap("B");
        
        // Xuat
        A.Xuat("A");
        B.Xuat("B");
        
        // tinh KC
        double d = A.TinhKC(B);
        System.out.println("Khoang cach AB: "+d );
    }
}

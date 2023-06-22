package december.chuong_04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * tinh dien tich va chu vi cua duong tron
 */
public class VD_04 {
    public static void main(String[] args) {
        DuongTron dt = new DuongTron();
        System.out.println("Nhap thong tin duong tron (C)");
        dt.Nhap("(C)");
        dt.Xuat("(C)");
        System.out.println("Chu vi cua duong tron: " + dt.Chuvi());
        System.out.println("Dien tich cua duong tron: " + dt.Dientich());
    }
}

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
public class DuongTron {
    // bien thanh phan
    double bk; 
    Diem tam;
    // ham thanh phan
    public void Nhap(String ten){
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap ban kinh duong tron %s: ",ten);
        this.bk = s.nextDouble();
        this.tam = new Diem();
        System.out.println("Nhap toa do tam duong tron (C)");
        this.tam.Nhap("tam");
    }
    public void Xuat(String ten){
        System.out.printf("\n Duong tron (%s) co tam O(%.2f;%.2f)\n",ten,this.tam.x,this.tam.y);
    }
    public double Chuvi(){
        return 2 * 3.14 * this.bk;
    }
    public double Dientich(){
        return 3.14 * this.bk * this.bk;
    }
}

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
public class PT_2 {
    int c;
    PT_1 p1 = new PT_1();
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        this.p1.Nhap();
        System.out.print("Nhap he so c: ");
        this.c = s.nextInt();
    }
  
    private String GiaiPT_2(){
        String kq = "";
        if(this.p1.a == 0){
            this.p1.Xuat();
        }
        else{
            int denta = this.p1.b * this.p1.b - 4*this.p1.a*this.c;
            if(denta < 0){
                kq = "Phuong trinh vo nghiem";
            }
            if(denta == 0){
                float x = -(float)this.p1.b / (2*this.p1.a);
                kq = "Phuong trinh co nghiem kep X1 = X2 = " + x;
            }
            if(denta > 0){
                double x1 = (-this.p1.b + Math.sqrt(denta)) / (2*this.p1.a);
                double x2 = (-this.p1.b - Math.sqrt(denta)) / (2*this.p1.a);
                kq = "Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + "\tx2 = " + x2 ;
            }
                
        }
        return kq;
    }
    
    public void Xuat(){
        System.out.println(GiaiPT_2());
    }
}

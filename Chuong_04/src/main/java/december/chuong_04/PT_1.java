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
public class PT_1 {
    int a, b;
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        this.a = s.nextInt();
        System.out.print("Nhap he so b: ");
        this.b = s.nextInt();
    }
    public String GiaiPT(){
        String kq = "";
        if(this.a == 0 ){
            if(this.b == 0){
                kq = "Phuong trinh vo so nghiem";
            }
            else {
                kq = "Phuong trinh vo nghiem";
            }
        }
        else{
            double x = -(double)this.b / this.a;
            kq = "Phuong trinh co nghiep: " + x;
        }
        return kq;
    }
    public void Xuat(){
        System.out.println(GiaiPT());
    }
}

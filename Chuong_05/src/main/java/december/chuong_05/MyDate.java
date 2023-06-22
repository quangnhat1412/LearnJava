package december.chuong_05;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AN515-45
 */
public class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 2000;
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int d = s.nextInt();
        if(d > 1 && d<=31){
            this.day = d;
        }
        System.out.print("Nhap thang: ");
        int m = s.nextInt();
        if(m > 1 && m<=12){
            this.month = m;
        }
        System.out.print("Nhap nam: ");
        int y = s.nextInt();
        if(y > 2000){
            this.year = y;
        }
        
    }
    
    // su dung overloading
    public void Nhap(int d, int m, int y){
        if(d > 1 && d<=31){
            this.day = d;
        }
        if(m > 1 && m<=12){
            this.month = m;
        }
        if(y > 2000){
            this.year = y;
        }
    }
    public void xuatNgay(){
        System.out.println("Ngay nhap: " + this.day);
    }
    public void xuatThang(){
        System.out.println("Thang nhap: " + this.month);
    }public void xuatNam(){
        System.out.println("Nam nhap: " + this.year);
    }
    public void XuatNTN(){
        System.out.println("Ngay " + this.day + " Thang " + this.month + " Nam " + this.year);
    }
}

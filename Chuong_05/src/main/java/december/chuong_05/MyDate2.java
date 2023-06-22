/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_05;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class MyDate2 {
    private int day = 1;
    private int month = 1;
    private int year = 2000;
    
    //ham khoi tao 
    public MyDate2(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // tao ham getset
    public int getDay(){
        return this.day;
    }
    public void setDay(int d){
        this.day = d;
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int m){
        this.day = m;
    }
    public int getYear(){
        return this.day;
    }
    public void setYear(int y){
        this.day = y;
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

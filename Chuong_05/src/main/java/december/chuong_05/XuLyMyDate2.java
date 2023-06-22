/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_05;


/**
 *
 * @author AN515-45
 */
public class XuLyMyDate2 {
    public static void main(String[] args) {
        MyDate2 d2 = new MyDate2( 14,12,2002);
        d2.XuatNTN();
        int d = d2.getDay();
        System.out.println("Nhap ngay: " + d); 
        d2.setDay(11);
        d2.XuatNTN();
        
    }
   
}

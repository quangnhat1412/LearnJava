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
public class XuLyMyDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        // su dung phuong thuc nhap thong tin ko tham so 
        //d1.Nhap();
        // su dung phuong thuc nhap co tham so
        d1.Nhap(14,12,2002);
        d1.XuatNTN();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_02;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class Songaytrongthang {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("------ TINH SO NGAY THANG TRONG MOT NAM -------");
        System.out.println("-----------------------------------------------");
        
        int thang,nam;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Hay nhap thang: ");
        thang = s.nextInt();
        System.out.print("Hay nhap nam: ");
        nam = s.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            case 2:
                if((nam % 4 == 0 && nam % 100 != 0) || nam % 400 ==0 ){
                    System.out.println("thang co 29 ngay");
                }
                else{
                    System.out.println("thang co 28 ngay");
                }
                break;
            default:
                break;
        }
        
    }
}

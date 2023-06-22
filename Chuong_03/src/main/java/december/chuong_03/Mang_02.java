/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_03;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 * Tạo mảng có 5 phần tử nhập từ bàn phím 
 * Xuất: tổng giá trị các phần tử 
 * XUất: Tổng giá trị các phần tử chẳn
 * Xuất: tổng giá trị các phần tử chia hết cho ba
 */
public class Mang_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] myArr = new int[5];
        
        // Nhap mang 
        for (int i = 0; i < myArr.length; i++) {
            System.out.printf("Nhap myArr[%d] = ",i);
            myArr[i] = s.nextInt();
        }
        // Xuat mang
        for(int x : myArr){
            System.out.printf("%5d\t",x);
        }
        System.out.println("\n");
        // Tong gia tri cac phan tu trong mang 
        int tong = 0;
        for(int x : myArr){
            tong += x;
        }
        System.out.println("tong cac phan tu: "+tong);
        
        // tong gia tri cac phan tu chan trong mang 
        int tongchan = 0;
        for(int x : myArr){
            if (x % 2 == 0) {
                tongchan += x;
            }
        }
        System.out.println("Tong cac phan tu chan: "+tongchan);
        
        // Dem cac phan tu chia het cho 3
        
        int dem = 0;
        for(int x : myArr){
            if (x % 3 == 0) {
                dem++;
            }
        }
        System.out.println("So cac phan tu chia het cho 3: "+dem);
    }
}

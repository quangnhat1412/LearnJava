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
 */
public class Mang01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // khai bao mang khong biet so phan tu
        int[] myArr;
        int n = 5; // de chua so phan tu cua mang
        
        // khoi tao mang chua 5 gia tri
        myArr = new int[n];
        // Nhap lieu cho mang 
        for (int i = 0; i < myArr.length; i++) {
            System.out.printf("Nhap myArr[%d] = ",i);
            myArr[i] = s.nextInt();
        }
        // Xuat du lieu cho mang
        for (int i = 0; i < myArr.length; i++) {
            System.out.printf("myArr[%d] = %d",i,myArr[i]);
            System.out.println("\n");
        }
        
        // xuat du lieu foreach 
        int i=0;
        for (int x : myArr) {
            myArr[i] = x + 1;
            System.out.printf("myArr[%d] = %d",i,myArr[i]);
            System.out.println("\n");
            i++;
        }
        
        
        // khai bao va khoi tao gia tri
        
        int[] myArr1 = {2,4,12,5,23,56,};
        for (int j = 0; j < myArr1.length; j++) {
            System.out.printf("myArr[%d] = %d",j,myArr1[i]);
            System.out.println("\n");
        }
    }
}

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
public class TongNso {
    public static void main(String[] args) {
        int n, tong = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhap so thu %d: ",i);
            int x = s.nextInt();
            tong += x;
        }
        System.out.printf("Tong %d so la %d",n,tong);
    }
}

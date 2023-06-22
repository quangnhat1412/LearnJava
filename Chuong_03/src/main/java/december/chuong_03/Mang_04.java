/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_03;
import java.util.Arrays;

/**
 *
 * @author AN515-45
 */
public class Mang_04 {
    public static void main(String[] args) {
        int[] myArr = {13,5,6,25,7,3,9,1,44,19};
        
        // Xuat mang chua sap xep
        System.out.println("Mang chua sap xep: " + Arrays.toString(myArr));
        
        // xuat mang sau khi sap xep
        Arrays.sort(myArr);
        System.out.println("Mang da qua sap xep: " + Arrays.toString(myArr));
        
        // vi tri phan tu cos gia gi 7 trong mang 
        int vt = Arrays.binarySearch(myArr,7);
        System.out.println("Vi tri cua phan tu co gia tri 7 trong mang la: " + vt);
        
        // Mang sau khi dien gia tri 10
        Arrays.fill(myArr,10);
        System.out.println("Mang sau khi dien gia tri 10: " + Arrays.toString(myArr));
    }
}

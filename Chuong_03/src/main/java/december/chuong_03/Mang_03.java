/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_03;

/**
 *
 * @author AN515-45
 */
public class Mang_03 {
    public static void main(String[] args) {
        int[] myArr = {13,5,6,25,7,3,9,1,44,19};
        
        // Xuat mang 
        for(int x : myArr){
            System.out.printf("%5d\t",x);    
        }
        System.out.println("\n");
        // Sap xep mang giam dan 
        for (int i = 0; i < myArr.length -1; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if(myArr[i] < myArr[j]) {
                    int t = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = t;
                }
            }
        }
        for(int x : myArr){
            System.out.printf("%5d\t",x);    
        }
        
        // Sap xep mang tang dan 
        for (int i = 0; i > myArr.length -1; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if(myArr[i] < myArr[j]) {
                    int t = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = t;
                }
            }
        }
        for(int x : myArr){
            System.out.printf("%5d\t",x);    
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_06.mystatic;

/**
 *
 * @author AN515-45
 */
public class XyLyPhepToan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m = 7, n = 10;
        int tong = PhepToan.tinhCong(m, n);
        int tru = PhepToan.tinhtru(n, m);
        
        System.out.println("tong 2 so: "+ tong);
        System.out.println("tru 2 so: "+ tru);
    }
    
}

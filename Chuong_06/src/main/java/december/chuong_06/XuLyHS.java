/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_06;

/**
 *
 * @author AN515-45
 */
public class XuLyHS {
    public static void main(String[] args) {
        HSCap1 hs1 = new HSCap1(7, 6, "A1001", "Tran Quang Nhat", "Nam");
        HSCap2 hs2 = new HSCap2(3, 7, 8, 8, "A2203", "Messi", "Nam");
        
        hs1.inThongTin();
        hs2.inThongTin();
    }
}

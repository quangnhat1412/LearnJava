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
public class XuLyLopTT {
    public static void main(String[] args) {
        HSCap1TT hs1 = new HSCap1TT(7, 8, "A1001", "Tran Quang Nhat", "Nam");
        HSCap2TT hs2 = new HSCap2TT(10, 9, 7, 6, "LM10", "Lionel Messi", "Nam");
        hs1.inThongTin();
        hs2.inThongTin();
        HocSinhTT hs3 = new HSCap1TT(3, 5, "CR7", "Ronaldo", "Nu");
    }
}

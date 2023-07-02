/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

/**
 *
 * @author AN515-45
 */
public class TestSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienList dssv = new SinhVienList();
        dssv.docDSSV();
        for(SinhVien sv : dssv.getDanhsach()){
            System.out.println(sv);
        }
        
        SinhVien sv1 = dssv.getSinhVien(4);
        System.out.println(sv1);
        
        dssv.delSV(sv1);
    }
    
}

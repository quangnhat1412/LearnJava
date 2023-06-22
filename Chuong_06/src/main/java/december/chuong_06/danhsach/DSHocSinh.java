/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_06.danhsach;

import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DSHocSinh {
    private ArrayList<HocSinhTT> danhsachhs;
    
    public DSHocSinh (){
        this.danhsachhs = new ArrayList<>();
    }

    public ArrayList<HocSinhTT> getDanhsachhs() {
        return danhsachhs;
    }

    public void setDanhsachhs(ArrayList<HocSinhTT> danhsachhs) {
        this.danhsachhs = danhsachhs;
    }
    
    public void themHS(HocSinhTT hs){
        this.danhsachhs.add(hs);
    }
    
    public void xoaHS(HocSinhTT hs){
        // Xoa doi tuong
        //this.danhsachhs.remove(hs);
        
        // xoa theo chi so 
        int vt = this.danhsachhs.indexOf(hs);
        this.danhsachhs.remove(vt);
    }
    
    public void inDanhSachHS(){
        System.out.println("Danh Sach Hoc Sinh");
        for (HocSinhTT hs : this.danhsachhs){
            hs.inThongTin();
        }
    }
}

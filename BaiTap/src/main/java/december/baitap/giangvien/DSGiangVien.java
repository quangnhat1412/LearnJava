/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap.giangvien;

import december.baitap.myinterface.I_CapNhapDanhSach;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DSGiangVien implements I_CapNhapDanhSach<GiangVien>{
    private ArrayList<GiangVien> danhsach;

    public DSGiangVien() {
        this.danhsach = new ArrayList<>();
    }

    public ArrayList<GiangVien> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<GiangVien> danhsach) {
        this.danhsach = danhsach;
    }
    
    public void add(GiangVien gv){
        this.danhsach.add(gv);
    }
    
    public void remove(GiangVien gv){
        // xoa theo vi tri 
        int vt = this.danhsach.indexOf(gv);
        this.danhsach.remove(vt);
    }
    
    public void printList(){
        System.out.println("Danh Sach Giang Vien ");
        for(GiangVien gv : this.danhsach){
            gv.xuatThongTin();
        }
    }
    
}

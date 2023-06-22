/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap;

import java.util.ArrayList;
import december.baitap.myinterface.I_CapNhapDanhSach;

/**
 *
 * @author AN515-45
 */
public class DanhSachNhanVien implements I_CapNhapDanhSach{
    private ArrayList<NhanVien> danhsach;

    public DanhSachNhanVien() {
        this.danhsach = new ArrayList<>();
    }

    public ArrayList<NhanVien> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<NhanVien> danhsach) {
        this.danhsach = danhsach;
    }

    
    
    public void add(Object nv){
        this.danhsach.add((NhanVien)nv);
    }
    
    public void remove(Object nvx){
        this.danhsach.remove((NhanVien)nvx);
    }
    
    public void printList(){
        System.out.println("Danh Sach Sinh Vien");
        for(NhanVien nv : this.danhsach){
            nv.xuatThongTin();
        }
    }
}

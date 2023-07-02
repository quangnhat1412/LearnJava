/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class SinhVienList {
    public ArrayList<SinhVien> danhsach;

    public SinhVienList() {
        this.danhsach = new ArrayList<>();
    }

    public SinhVienList(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }
    
    public ArrayList<SinhVien> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    // Doc danh sach sinh vien tu tap tin
    public void docDSSV(){
        this.danhsach.clear(); // Xoa tat ca sinh vien co trong ds
        ArrayList<String> chuoiDSSV = DocGhiFile.docFile("data/sinhvien.txt");
        for(String chuoiSV : chuoiDSSV){
            String[] mangChuoi = chuoiSV.trim().split(";");
            this.danhsach.add(new SinhVien(mangChuoi[0], mangChuoi[1], Integer.parseInt(mangChuoi[2])));
        }
    }
        
    public int tongSoSV(){
        return this.danhsach.size();
    }
    
    public SinhVien getSinhVien(int chiSo){
        SinhVien sv = null;
        if(chiSo >= 0 && chiSo <= tongSoSV()){
            sv = this.danhsach.get(chiSo);
        }
        return sv;
    }
    
    public boolean addSV(SinhVien sv){
        // Neu sv da ton tai trong danhsach
        if(this.danhsach.contains(sv)){
            return false;
        }
        this.danhsach.add(sv);
        // Ghi sinh vien vua them vao tap tin 
        ghiDSSV();
        return true;
    }
    
    public boolean delSV(SinhVien sv){
        this.danhsach.remove(sv);
        
        // Cap nhat lai tap tin
        ghiDSSV();
        
        return true;
    }
    
    public boolean updateSV(SinhVien sv){
        // Lay sinh vien can sua trong this.danhsach
        int vt = this.danhsach.indexOf(sv);
        this.danhsach.set(vt, sv);
        
        // Cap Nhật lại tập tin
        ghiDSSV();
        return true;
    }
    
    public void ghiDSSV(){
        DocGhiFile.ghiFile(this.danhsach, "data/sinhvien.txt");
    }
}

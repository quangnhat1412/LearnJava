/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_05;

/**
 *
 * @author AN515-45
 */
public class QLHocSinh {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("A001","Tran Quang Nhat", new LopHoc("C21TH2", new Khoa("Khoa CNTT", "Tay Ninh")), 9 , 10, new Ngay(14,12,2002));
        HocSinh hs2 = new HocSinh("A002","Lionel Messi", new LopHoc("Doi A", new Khoa("Barcelona", "Argentian")), 10 , 9.5, new Ngay(26,04,1987));
        HocSinh hs3 = new HocSinh("A003","Cristiano Ronaldo", new LopHoc("Doi da C2", new Khoa("Manchester United", "Portugal")), 5 , 8, new Ngay(14,12,2002));
        
        
        // Xuat Ten Khoa 
        hs1.xuatTenKhoa();
        hs2.xuatTenKhoa();
        hs3.xuatTenKhoa();
        
        // Xuat diem trung binh 
        hs1.diemTrungBinh();
        hs2.diemTrungBinh();
        hs3.diemTrungBinh();
        
        // Xuat xep loai 
        
        hs1.xepLoai();
        hs2.xepLoai();
        hs3.xepLoai();
        
        // So sanh ngay sinh 
        
        System.out.println("hs1 va hs2 co cung ngay sinh khong ??? " + hs1.sSngaySinhHS(hs2));
        System.out.println("hs1 va hs3 co cung ngay sinh khong ??? " + hs1.sSngaySinhHS(hs3));
    }
}

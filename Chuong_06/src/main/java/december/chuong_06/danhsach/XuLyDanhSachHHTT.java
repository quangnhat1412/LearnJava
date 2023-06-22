/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_06.danhsach;

/**
 *
 * @author AN515-45
 */
public class XuLyDanhSachHHTT {
    public static void main(String[] args) {
        DSHocSinh dshs = new DSHocSinh();
        dshs.themHS(new HSCap1TT("A001", "Tran Quang Nhat", "Nam", 8, 9));
        dshs.themHS(new HSCap1TT("A002", "Vo Thi Sau", "Nam", 7, 10));
        dshs.themHS(new HSCap1TT("A003", "Nguyen Tat Thanh", "Nam", 9, 4));
        
        dshs.themHS(new HSCap2TT("B001", "Ronaldo", "Nu", 6, 7, 8, 9));
        dshs.themHS(new HSCap2TT("B002", "Messi", "Nam", 10, 6, 5, 9));
        dshs.themHS(new HSCap2TT("B003", "Neymar Jr", "Nam", 6, 7, 8, 9));
        
        dshs.inDanhSachHS();
        
        System.out.println("Sau khi xoa danh sach");
        HocSinhTT hsxoa = dshs.getDanhsachhs().get(3);
        dshs.xoaHS(hsxoa);
        dshs.inDanhSachHS();
    }
}

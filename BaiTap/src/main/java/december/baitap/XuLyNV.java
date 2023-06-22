/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap;

import december.baitap.ngaythangnam.Ngay;
import java.util.Collections;

/**
 *
 * @author AN515-45
 */
public class XuLyNV {
    public static void main(String[] args) {
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        NhanVien nv1 = new NhanVienQL("N001", "Tran Quang Nhat", new Ngay(14,12,2002), 2000000, 200000, 320321);
        NhanVien nv3 = new NhanVienQL("N002", "Tran Quang Khai", new Ngay(14,12,2002), 2000000, 200000, 320321);
        NhanVienQL nv2 = new NhanVienQL("N003", "Vo Thi Sau", new Ngay(14,12,2002), 2000000, 200000, 320321);
        NhanVienQL nv4 = new NhanVienQL("N004", "Nguyen Duc Anh", new Ngay(14,12,2002), 2000000, 200000, 320321);
        NhanVienQL nv5 = new NhanVienQL("N005", "Le Bao Binh", new Ngay(14,12,2002), 2000000, 200000, 320321);
        dsnv.add(nv1);
        dsnv.add(nv2);
        dsnv.add(nv3);
        dsnv.add(nv4);
        dsnv.add(nv5);
        
        System.out.println("danh sach chua qua sap xep");
        dsnv.printList();
        
        System.out.println("danh sach nhan vien tang dan"); // a --> z
        Collections.sort(dsnv.getDanhsach(), NhanVien.compareByten());
        for (NhanVien nv : dsnv.getDanhsach()){
            System.out.println(nv);
        }
        
        System.out.println("danh sach nhan vien giam dan"); // z --> a
        Collections.sort(dsnv.getDanhsach(), NhanVien.compareByten().reversed());
        for (NhanVien nv : dsnv.getDanhsach()){
            System.out.println(nv);
        }
    }
}

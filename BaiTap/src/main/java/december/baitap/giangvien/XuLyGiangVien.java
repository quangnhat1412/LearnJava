/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap.giangvien;

import december.baitap.ngaythangnam.Ngay;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author AN515-45
 */
public class XuLyGiangVien {
    public static void main(String[] args) {
        // khoi tao gv1 va gv2 co du lieu 
        GiangVien gv1 = new GiangVienCH("Cristiano Ronaldo", new Ngay(05, 02, 1985), 100, 7000000, 70);
        GiangVien gv2 = new GiangVienTT("Lionel Messi", new Ngay(26, 04, 1987), 50 , 160000);
        
//        // khoi tao gv3, gv4 co du lieu nhap tu ban phim
//        GiangVien gv3 = new GiangVienCH();
//        GiangVien gv4 = new GiangVienTT();
//        gv3.nhapThongTin();
//        gv4.nhapThongTin();
        
        // xuat thong tin
//        gv1.xuatThongTin();
//        gv2.xuatThongTin();
//        gv3.xuatThongTin();
//        gv4.xuatThongTin();

        DSGiangVien dsgv = new DSGiangVien();
        dsgv.add(gv2);
        dsgv.add(gv1);
        dsgv.printList();
        
        Collections.sort(dsgv.getDanhsach());
        System.out.println("sap danh sach theo so gio làm viec tang dan");
        for (GiangVien gv : dsgv.getDanhsach()){
            System.out.println(gv);
        }
        
        Collections.sort(dsgv.getDanhsach(), Comparator.reverseOrder()); // day la phuong thuc giam dan có sẳn
        System.out.println("Sap xep danh sach theo so gio làm viec giam dan");
        for (GiangVien gv : dsgv.getDanhsach()){
            System.out.println(gv);
        }
    }
}

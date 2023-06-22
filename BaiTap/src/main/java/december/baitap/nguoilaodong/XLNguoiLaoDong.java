/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap.nguoilaodong;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author AN515-45
 */
public class XLNguoiLaoDong {
    public static void main(String[] args) {
        //NguoiLaoDong nv4 = new NhanVien(hoTen, LocalDate.MIN, 0, 0, chucVu, loaiNV);
        NguoiLaoDong nv1= new NhanVien("Tran Quang Nhat", LocalDate.of(2002,12,14), 1, 3000000,"Truong Phong", "A");
        //NguoiLaoDong nv4 = new GiaoVien(hoTen, LocalDate.MIN, 0, 0, LocalDate.MAX, 0, 0);
        NguoiLaoDong nv2= new GiaoVien("Lionel Messi", LocalDate.of(1987,04,26),5, 2000000, LocalDate.of(2020,6,8), 50,300000);

        NguoiLaoDong nv3 = new NhanVien("Truong Cong Dinh", LocalDate.of(2002,12,14), 3, 1500000,"Truong Phong", "A");
//        nv3.nhapThongTin();
//
//        nv1.xuatThongTin();
//        nv2.xuatThongTin();
//        nv3.xuatThongTin();
        DSNguoiLaoDong dsnld = new DSNguoiLaoDong();
        dsnld.add(nv3);
        dsnld.add(nv2);
        dsnld.add(nv1);
        
        dsnld.printList();
        System.out.println("Tong so nhan vien trong cong ty: "+dsnld.tongSoNLD());
        
        System.out.println("Tong so thu nhap cua nhan vien cong ty: "+dsnld.tongThuNhap());
        
        System.out.println("Thu nhap lon nhat cong ty: "+dsnld.thuNhapLonNhat());
        
        
        // Sap xep danh sach theo yêu cau
        Collections.sort(dsnld.getDanhsach(), NguoiLaoDong.compareByten()); // theo ten tang dan
        System.out.println("Sap xep danh sach tang dan theo ten");
        for (NguoiLaoDong nld : dsnld.getDanhsach()){
            System.out.println(nld);
        }
       
        Collections.sort(dsnld.getDanhsach()); // theo he so luong tang dan
        //Collections.sort(dsnld.getDanhsach(), Comparator.reverseOrder()); // theo he so luong giam dan
        System.out.println("Sap xep danh sach tang dan theo he so luong");
        for (NguoiLaoDong nld : dsnld.getDanhsach()){
            System.out.println(nld);
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_07.lopthuvien;

import december.chuong_07.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author AN515-45
 */
public class XuLyDanhSachHHTT {
    public static void main(String[] args) {
        DSHocSinh dshs = new DSHocSinh();
        dshs.themHS(new HSCap1TT("A001", "Tran Quang Nhat", "Nam",10, 8, 9));
        dshs.themHS(new HSCap1TT("A002", "Vo Thi Sau", "Nam",8, 7, 10));
        dshs.themHS(new HSCap1TT("A003", "Nguyen Chi Thien", "Nam", 9, 9, 4));
        
        dshs.themHS(new HSCap2TT("B001", "Tran Quang Khai", "Nu",14, 6, 7, 8, 9));
        dshs.themHS(new HSCap2TT("B002", "Le Thi Loi", "Nam",12, 10, 6, 5, 9));
        dshs.themHS(new HSCap2TT("B003", "Nguyen Tien Dung", "Nam",11, 6, 7, 8, 9));
        
        dshs.inDanhSachHS();
        
//        System.out.println("Sau khi xoa danh sach");
//        HocSinhTT hsxoa = dshs.getDanhsachhs().get(3);
//        dshs.xoaHS(hsxoa);
//        dshs.inDanhSachHS();
//        HocSinhTT hs1 = dshs.getDanhsachhs().get(0);
//        System.out.println("Thong tin hoc sinh: " + hs1);
        
        // in danh sach hoc sinh 
        for (HocSinhTT hs : dshs.getDanhsachhs()){
            System.out.println(hs);
        }
        
        // sap xep danh sach so nguyen
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(10);
        nums.add(7);
        // in nums
        System.out.println(nums.toString());
        
        // sap xep cac so nguyen tang dan 
        Collections.sort(nums);
        System.out.println("sap xep nums tang dan: "+nums.toString());
        
        // sap xep cac so nguyen giam dan 
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("sap xep nums giam dan: "+nums.toString());
        
        // Sap tang dan mang hoc sinh theo ho ten
        Collections.sort(dshs.getDanhsachhs());
        System.out.println("Sap xep theo ho ten tang dan");
        for (HocSinhTT hs : dshs.getDanhsachhs()){
            System.out.println(hs);
        }
        
        // Sap giam dan mang hoc sinh theo ho ten
        Collections.sort(dshs.getDanhsachhs(), Comparator.reverseOrder());
        System.out.println("Sap xep theo ho ten giam gian");
        for (HocSinhTT hs : dshs.getDanhsachhs()){
            System.out.println(hs);
        }
        
        // sap tang dan hoc sinh theo tuoi
        Collections.sort(dshs.getDanhsachhs(), HocSinhTT.compareBytuoi());
        System.out.println("Sap xep theo tuoi tang dan");
        for (HocSinhTT hs : dshs.getDanhsachhs()){
            System.out.println(hs);
        }
        // sap giam dan hoc sinh theo tuoi
        Collections.sort(dshs.getDanhsachhs(), HocSinhTT.compareBytuoi().reversed());
        System.out.println("Sap xep theo tuoi giam dan");
        for (HocSinhTT hs : dshs.getDanhsachhs()){
            System.out.println(hs);
        }
        
        // Sap xep theo ten giam dan 
        Collections.sort(dshs.getDanhsachhs(), HocSinhTT.compareByten().reversed());
        System.out.println("Sap xep theo ten giam dan");
        for (HocSinhTT hs : dshs.getDanhsachhs()){
            System.out.println(hs);
        }
        
        // Sap xep theo ten tang dan 
        Collections.sort(dshs.getDanhsachhs(), HocSinhTT.compareByten());
        System.out.println("Sap xep theo ten tang dan");
        for (HocSinhTT hs : dshs.getDanhsachhs()){
            System.out.println(hs);
        }
    }
}

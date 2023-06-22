/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AN515-45
 */
public class XuLyNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khoi tao ArrayList de chua danh sach nhan vien
        ArrayList<NhanVien> nhanviens = new ArrayList<>();
        
        // Tao duong dan den tap tin can doc
        String path = "data2/dsnhanvien.txt";
        
        // Tien hanh doc 
        FileReader file;
        try {
            file = new FileReader(path);
            BufferedReader doc_file = new BufferedReader(file);
            String dong;
            while((dong = doc_file.readLine()) != null){
                if(dong.isEmpty()) continue;
                String[] mangDong = dong.trim().split(":"); // cat chuoi dua tren ki tu ":"
                NhanVien nv = new NhanVien(mangDong[0], mangDong[1], Integer.parseInt(mangDong[2]));
                nhanviens.add(nv);
            }
            doc_file.close();
        } catch (IOException ex) {
            System.out.println("Doc tap tin that bai");
        }
        // Xuat thong tin danh nhan vien 
        System.out.println("Danh Sach Nhan Vien");
        for (NhanVien nv : nhanviens){
            System.out.println(nv);
        }
        
        // Sap xep danh sach nhan vien theo ten tang dan
        System.out.println("Danh Sach Nhan Vien Theo Ten"); // a --> z va theo he so luong (tang dan)
        Collections.sort(nhanviens, NhanVien.compareByten().reversed()); // reversed() la phuong thuc sap xep nguoc lai(Giam dan)
        //Collections.sort(nhanviens, Comparator.reverseOrder());
        for (NhanVien nv : nhanviens){
            System.out.println(nv);
        }
        
        // Luu danh sach nhan vien vao tap tin (moi nhan vien la mot tap tin;
        for (NhanVien nv : nhanviens){
            // Tao duong dan
            String path_ghi = "data2/dsnhanvien/" + nv.getMaNV() + ".txt";
            
            try {
                // Tien hanh ghi
                FileWriter file_ghi = new FileWriter(path_ghi);
                BufferedWriter ghi_file = new BufferedWriter(file_ghi);
                String chuoiNV = nv.getMaNV() + ":" + nv.getTenNV() + ":" + nv.getHeSL();
                ghi_file.write(chuoiNV);
                ghi_file.close();
            } catch (IOException ex) {
                System.out.println("Ghi tap tin that bai !!!");
                
            }
            
        }
        
        
    }
    
}

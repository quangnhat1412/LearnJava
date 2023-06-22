/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class DocDSNV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <NhanVien> nhanviens = new ArrayList<>();
        
        // Khaibao folder chua cac tap tin
        File folder = new File("data2/dsnhanvien");
        // Duyen qua folder để tiến hành truy xuat cac file nhan vien
        File[] ds_file = folder.listFiles();
        if(ds_file != null){
            for (File f : ds_file){
                if(f.isFile() && f.getName().endsWith(".txt")){
                    // lay duong dan cua file 
                    String dd_f = f.getAbsolutePath();
                    // tien hanh doc 
                    FileReader file;
                    try {
                        file = new FileReader(dd_f);
                        BufferedReader doc_file = new BufferedReader(file);
                        String chuoiNV = doc_file.readLine();
                        if(chuoiNV.isEmpty()) continue;
                        String[] mangTach = chuoiNV.trim().split(":");
                        nhanviens.add(new NhanVien(mangTach[0], mangTach[1], Integer.parseInt(mangTach[2])));
                        doc_file.close();
                        
                    } catch (IOException ex) {
                        System.out.println("Doc tap tin that bai");
                    }
                    
                    
                }
            }
        }
        
        // danh sach nhan vien doc dc
        System.out.println("danh sach nhan vien");
        for(NhanVien nv : nhanviens){
            System.out.println(nv);
        }
        
        // sap xep theo ten 
        System.out.println("Danh dach theo ten");
        Collections.sort(nhanviens, NhanVien.compareByten());
        for(NhanVien nv : nhanviens){
            System.out.println(nv);
        }
    }
    
}

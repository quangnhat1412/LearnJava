/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AN515-45
 */
public class XuLyHS {
    public static void main(String[] args) {
        // Khoi tao danh sach chua hoc sinh
        ArrayList<HocSinh> hocsinhs = new ArrayList<>();
        
        // Tien hanh doc du lieu vao hocsinhs
        String path = "data2/danhsachHS/dshocsinh.txt";
        try {
            FileReader file = new FileReader(path);
            BufferedReader doc_file = new BufferedReader(file);
            String dong;
            while((dong = doc_file.readLine()) != null){
                if(dong.isEmpty()) continue;
                String[] mangDong = dong.trim().split(";");
                if(mangDong.length == 4){
                    HocSinh hs_mg = new HocSinhMauGiao(mangDong[0], mangDong[1], Integer.parseInt(mangDong[2]), Integer.parseInt(mangDong[3]));
                    hocsinhs.add(hs_mg);
                }
                if(mangDong.length == 5){
                    HocSinh hs_c1 = new HocSinhCap1(mangDong[0], mangDong[1], Integer.parseInt(mangDong[2]), Double.parseDouble(mangDong[3]), Double.parseDouble(mangDong[4]));
                    hocsinhs.add(hs_c1);
                }
                if(mangDong.length == 6){
                    HocSinh hs_c2 = new HocSinhCap2(mangDong[0], mangDong[1], Integer.parseInt(mangDong[2]), Double.parseDouble(mangDong[3]), Double.parseDouble(mangDong[4]), Double.parseDouble(mangDong[5]));
                    hocsinhs.add(hs_c2);
                }
                else{
                    continue;
                }
                
            }
            doc_file.close();
        } catch (IOException ex) {
            System.out.println("doc tap tin that bai !!!");
        }
        
        System.out.println("Danh sach hoc sinh");
        for(HocSinh hs : hocsinhs) {
            System.out.println(hs);
        }
        
        // Ghi danh sach hoc sinh, ung voi moi loai hoc sinh la 1 tap tin (vd: hocSinhMauGiao la maugiao.txt)
        
//        for(HocSinh hs : hocsinhs){
//            String path1 = null;
//            String chuoiHS = hs.id + ";" + hs.getName()+ ";" + hs.getAge();
//            if(hs instanceof HocSinhMauGiao){
//                path1 = "data2/maugiao/" + hs.getId() + ".txt";
//                chuoiHS +=";" + ((HocSinhMauGiao) hs).getDay_off();
//                
//            }
//            if(hs instanceof HocSinhCap1){
//                path1 = "data2/cap1/" + hs.getId() + ".txt";
//                chuoiHS += ";" + ((HocSinhCap1) hs).getDiemToan() + ";" + ((HocSinhCap1) hs).getDiemVan();
//                
//            }
//            if(hs instanceof HocSinhCap2){
//                path1 = "data2/cap2/" + hs.getId() + ".txt";
//                hs = new HocSinhCap2();
//                chuoiHS += ";" + ((HocSinhCap2) hs).getDiemHoa() + ";" + ((HocSinhCap2) hs).getDimeLy() + ";" + ((HocSinhCap2) hs).getDiemTA();
//            }
//            try {
//                FileWriter file1 = new FileWriter(path1);
//                BufferedWriter ghi_file = new BufferedWriter(file1);
//                ghi_file.write(chuoiHS);
//                ghi_file.newLine();
//                ghi_file.close();
//            } catch (IOException ex) {
//                System.out.println("Ghi tap tin that bai");
//            }
//            
//        }
//        System.out.println("Ghi tap tin thanh cong");
        
        
        // luu tat cả chung 1 taptin 
        String path2 = "data2/hocsinh_all/ds.txt";
        try {
            FileWriter file_g = new FileWriter(path2);
            BufferedWriter ghi_file1 = new BufferedWriter(file_g);
            for(HocSinh hs : hocsinhs){
                String chuoiHS = hs.id + ";" + hs.getName()+ ";" + hs.getAge();
                if(hs instanceof HocSinhMauGiao){
                    chuoiHS +=";" + ((HocSinhMauGiao) hs).getDay_off();
                }
                if(hs instanceof HocSinhCap1){
                    chuoiHS += ";" + ((HocSinhCap1) hs).getDiemToan() + ";" + ((HocSinhCap1) hs).getDiemVan();
                }
                if(hs instanceof HocSinhCap2){
                    hs = new HocSinhCap2();
                    chuoiHS += ";" + ((HocSinhCap2) hs).getDiemHoa() + ";" + ((HocSinhCap2) hs).getDiemLy() + ";" + ((HocSinhCap2) hs).getDiemTA();
                }
                ghi_file1.write(chuoiHS);
                ghi_file1.newLine();
            }   
            ghi_file1.close();
        } catch (IOException ex) {
            System.out.println("ghi that bai");
        }
        System.out.println("ghi thanh cong");
        
    }
    
}

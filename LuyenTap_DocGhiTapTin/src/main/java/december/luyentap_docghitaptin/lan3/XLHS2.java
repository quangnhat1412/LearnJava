/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author AN515-45
 */
public class XLHS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khoi tao danh sach chua hoc sinh
        DanhSachHS hocsinhs = new DanhSachHS();
        
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
            System.out.println("doc thanh cong");
        } catch (IOException ex) {
            System.out.println("doc tap tin that bai !!!");
        }
        
        System.out.println("Danh sach hoc sinh");
        hocsinhs.printList();
        
        // Ghi danh sach hoc sinh, ung voi moi loai hoc sinh la 1 tap tin (vd: hocSinhMauGiao la maugiao.txt)
        
        hocsinhs.saveList();
        System.out.println("Ghi tap tin thanh cong");
        
        
        hocsinhs.printList();
    }
    
}

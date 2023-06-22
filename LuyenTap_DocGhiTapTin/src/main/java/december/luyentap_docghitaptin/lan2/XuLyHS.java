/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AN515-45
 */
public class XuLyHS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // khoi tao ArrayList de chua cac danh sach hoc sinh doc tu tap tin 
        ArrayList<HocSinh> hocsinhs = new ArrayList<>();
        
        // tao duong dan
        String path = "data2/dshocsinh.txt";
        
        try {
            FileReader file = new FileReader(path);
            BufferedReader doc_File = new BufferedReader(file);
            String dong;
            while((dong = doc_File.readLine()) != null){
                if(dong.isEmpty()) continue;
                String[] mangTach = dong.trim().split(";");
                if(mangTach.length !=3) continue ;
                HocSinh hs = new HocSinh(mangTach[0], mangTach[1], Integer.parseInt(mangTach[2]));
                hocsinhs.add(hs);
            }
            doc_File.close();
        } catch (IOException ex) {
            System.out.println("Doc tap tin that bai, hay thu lai !!!");
        }
        
        System.out.println("Danh sach hoc sinh cua truong");
        for (HocSinh hs : hocsinhs){
            System.out.println(hs);
        }
        System.out.println("Danh sach hoc sinh cua truong theo ten"); // a --- > z
        Collections.sort(hocsinhs, HocSinh.comparaByten());
        for (HocSinh hs : hocsinhs){
            System.out.println(hs);
        }

        // Ghi thong tin cua danh sach hoc sinh vao tap tin (ung voi moi hoc sinh la 1 tap tin)
        for(HocSinh hs : hocsinhs){
            // Ung voi moi hoc sinh ta tao ra 1 tap tin .txt (<MaHS.txt>)
            String path_hs = "data2/danhsachHS/" + hs.getMaHS() + ".txt";
            String chuoiHS = hs.getMaHS() + ";" + hs.getTenHS() + ";" + hs.getTuoi();
            
            try {
                FileWriter file_hs = new FileWriter(path_hs);
                BufferedWriter ghi_file = new BufferedWriter(file_hs);
                ghi_file.write(chuoiHS);
                ghi_file.close();
            } catch (IOException ex) {
                System.out.println("Ghi tap tin that bai !!!");
            }
            
        }
        System.out.println("Ghi tap tin thanh cong !!!");
        
    }
    
}

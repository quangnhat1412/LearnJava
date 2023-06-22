/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin;

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
public class DocTT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Yeu cau doc du lieu dsach hoc sinh va ghi lai ung voi moi hoc sinh la 1 file
        
        // Tao ra 1 ArrayList HocSinh de chua hoc sinh doc dc tu taptin
        ArrayList<HocSinh> list_HS = new ArrayList<>();
        
        // Tao duong dan cua tap tin can doc
        String path = "data/dshocsinh.txt";
        
        try {
            // Tien hanh doc
            FileReader file = new FileReader(path);
            BufferedReader docFile = new BufferedReader(file);
            String dong;
            while((dong = docFile.readLine())!= null){
                String[] mangTach = dong.trim().split(";");
                if(dong.isEmpty()) continue;
                HocSinh hs = new HocSinh(mangTach[0], mangTach[1], Integer.parseInt(mangTach[2]));
                list_HS.add(hs);
            }
            docFile.close();
            
            // Xuat danh sach hoc sinh doc dc trong ArrayList;
            for (HocSinh hs : list_HS){
                System.out.println(hs);
            }
        } catch (IOException ex) {
            System.out.println("Doc tap tin that bai, hay kiem tra lai code !!!");
        }
        
        
        // Ghi hoc sinh 
        for (HocSinh hs_ghi : list_HS){
            String path_Save = "data/" + hs_ghi.getMaHS() + ".txt";
            String chuoiHS = hs_ghi.getMaHS()+ ";" + hs_ghi.getTenHS()+ ";" + hs_ghi.getTuoi();
            
            try {
                FileWriter file_ghi = new FileWriter(path_Save);
                BufferedWriter ghi_file = new BufferedWriter(file_ghi);
                ghi_file.write(chuoiHS);
                ghi_file.close();
                
            } catch (IOException ex) {
                System.out.println("Ghi Tap Tin that bai !!!");
            }
        }
        System.out.println("Ghi tap tin thanh cong !!!");
    }
    
}

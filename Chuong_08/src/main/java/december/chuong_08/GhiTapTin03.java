/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class GhiTapTin03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> dshs = new ArrayList<>();
        String path = "data/dshocsinh.txt";
        // Doc danh sach hoc sinh tu tap tin vao dshs
        try {
            FileReader file = new FileReader(path);
            BufferedReader docFile = new BufferedReader(file);
            String dong;
            while((dong = docFile.readLine()) != null){
                String[] mangTach = dong.trim().split(";");
                if(dong.isEmpty()) continue;
                HocSinh hs = new HocSinh(mangTach[0], mangTach[1], Integer.parseInt(mangTach[2]));
                dshs.add(hs);
            }
            docFile.close();
            // Xuat danh sach hoc sinh trong Arraylist
            for (HocSinh hs : dshs){
                System.out.println(hs);
            }
        } catch (IOException ex) {
            System.out.println("Doc tap tin that bai");
            ex.printStackTrace();
        }
        // Ghi các học sinh trong ArrayList vào tap tin (1 học sinh là 1 tập tin)
        for (HocSinh hs : dshs){
            // Ứng vỡi mỗi học sinh ta sẽ tạo 1 tập tin có tên là <MaHS>.txt
            String path1 = "data/" + hs.getMaHS() + ".txt";
            String chuoiHS = hs.getMaHS() + ";" + hs.getTenHS() + ";" +hs.getTuoi();
            try {
                FileWriter file1 = new FileWriter(path1);
                BufferedWriter ghi_file = new BufferedWriter(file1);
                ghi_file.write(chuoiHS);
                ghi_file.close();
                
            } catch (IOException ex) {
                System.out.println("Ghi tap tin that bai");
            }
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocTapTin02 {

    public static void main(String[] args) {
        ArrayList<HocSinh> dshs = new ArrayList<>();
        String path = "data/dshocsinh.txt";
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
        
    }
    
}

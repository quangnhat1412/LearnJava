/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AN515-45
 */
public class DocTapTin03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        // 1. Khai bao folder chứa danh sách các tập tin 
        File folder = new File("data");
        // 2. Duyện qua folder để tiến hành truy xuất học sinh
        File[] listFile = folder.listFiles();
        if(listFile != null){
            for(File f : listFile){
                if(f.isFile() && f.getName().startsWith("A") && f.getName().endsWith(".txt")){
                    // Lay duong dan cua file
                    String dd_f = f.getAbsolutePath();
                    try {
                        FileReader file = new FileReader(dd_f);
                        BufferedReader doc_file = new BufferedReader(file);
                        String chuoiHS = doc_file.readLine();
                        String[] mangTach = chuoiHS.split(";");
                        ds.add(new HocSinh(mangTach[0], mangTach[1], Integer.parseInt(mangTach[2])));
                        doc_file.close();
                    } catch (IOException ex) {
                        System.out.println("doc tap tin that bai");
                    }
                    
                }
            }
            
        }
        // in danh sach hoc sinh doc duoc 
        for(HocSinh hs : ds){
            System.out.println(hs);
        }
        
        // Xoa tap tin A004;
        HocSinh hs_A004 = ds.get(3);
        String dd_xoa = "data/" + hs_A004.getMaHS() + ".txt";
        File hs_xoa = new File(dd_xoa);
        if(hs_xoa.exists()){
            hs_xoa.delete();
        }
        
    }
    
}

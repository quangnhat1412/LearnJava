/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin;

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
public class DocTapTin02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<HocSinh> dsachHS = new ArrayList<>();
        
        // Khai bao folder chua danh sach tap tin can doc
        File folder = new File("data");
        // Duyen qua folder de tien hanh truy xuat hoc sinh
        File[] listFile = folder.listFiles();
        if(listFile != null){
            for(File f : listFile){
                if(f.isFile() && f.getName().startsWith("A") && f.getName().endsWith(".txt")){
                    // phuong thuc  lay duong dan cua file 
                    String dd_f = f.getAbsolutePath();
                    try {
                        FileReader file = new FileReader(dd_f);
                        BufferedReader doc_file = new BufferedReader(file);
                        String chuoiHS = doc_file.readLine();
                        String[] mangTach = chuoiHS.trim().split(";");
                        dsachHS.add(new HocSinh(mangTach[0], mangTach[1], Integer.parseInt(mangTach[2])));
                        doc_file.close();
                    } catch (IOException ex) {
                        System.out.println("doc tap tin that bai");
                    }
                    
                }
            }
        }
        for (HocSinh hs : dsachHS){
            System.out.println(hs);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.json;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author AN515-45
 */
public class DocDSDT_TuCacTepTin {

    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<HocSinh> ds = new ArrayList<>();

        // Tao folder chua cac file
        File folder = new File("data3/json/dsfile");
        File[] list_f = folder.listFiles();
        if (list_f != null) {
            for (File f : list_f) {
                if (f != null && f.getName().endsWith(".json")) {
                    try {
                        FileReader file_doc = new FileReader(f.getAbsoluteFile());
                        HocSinh hs = gson.fromJson(file_doc, HocSinh.class);
                        ds.add(hs);
                        file_doc.close();
                       
                    } catch (IOException ex) {
                        System.out.println("That Bai");
                        ex.printStackTrace();
                    }
                }
            }
            System.out.println("Doc tap tin thanh cong");
        }
        for(HocSinh hs : ds ){
            System.out.println(hs);
        }
    }
}

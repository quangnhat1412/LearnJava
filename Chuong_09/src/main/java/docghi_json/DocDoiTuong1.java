/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghi_json;

import com.google.gson.Gson;
import java.io.FileReader;

/**
 *
 * @author AN515-45
 */
public class DocDoiTuong1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            FileReader file_doc = new FileReader("json/hs.json");
            HocSinh hs = gson.fromJson(file_doc, HocSinh.class);
            file_doc.close();
            System.out.println(hs);
        } catch (Exception e) {
            System.out.println("doc that bai");
        }
    }
    
}

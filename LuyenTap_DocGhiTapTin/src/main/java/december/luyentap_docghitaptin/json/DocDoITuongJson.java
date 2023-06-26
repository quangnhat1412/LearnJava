/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.json;

import com.google.gson.Gson;
import java.io.FileReader;

/**
 *
 * @author AN515-45
 */
public class DocDoITuongJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            FileReader file_doc = new FileReader("data3/json/hs_le.json");
            HocSinh hs = gson.fromJson(file_doc, HocSinh.class);
            file_doc.close();
            System.out.println("Doc Tap tin thanh cong");
            System.out.println(hs);
        } catch (Exception e) {
            System.out.println("Doc tap tin that bai");
        }
        
    }
}

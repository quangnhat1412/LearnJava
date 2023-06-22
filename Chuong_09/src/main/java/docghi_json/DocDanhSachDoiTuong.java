/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghi_json;

import com.google.gson.Gson;
import java.io.FileReader;
import java.util.ArrayList;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/**
 *
 * @author AN515-45
 */
public class DocDanhSachDoiTuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        Gson gson = new Gson();
        // Dinh nghia kieu cua ArrayList<HocSinh>
        Type listType = new TypeToken<ArrayList<HocSinh>>(){}.getType();
        try {
            FileReader file_doc = new FileReader("json/hocsinhds.json");
            ds = gson.fromJson(file_doc, listType);
            file_doc.close();
            for(HocSinh hs : ds ){
                System.out.println(hs);
            }
            System.out.println("doc thanh cong");
        } catch (Exception e) {
            System.out.println("doc that bai");
        }
    }
    
}

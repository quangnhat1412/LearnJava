/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DocDSDoiTuongJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<HocSinh> ds = new ArrayList<>();
        try {
            // Dinh nghia kieu cua ArrayList<HocSinh>
            Type listType = new TypeToken<ArrayList<HocSinh>>(){}.getType();
            
            FileReader file_doc = new FileReader("data3/json/dshs.json");
            ds = gson.fromJson(file_doc,listType);
            file_doc.close();
            System.out.println("Thanh Cong");
        } catch (Exception e) {
            System.out.println("that bai");
        
        }
        for(HocSinh hs : ds){
            System.out.println(hs);
        }
    }
}

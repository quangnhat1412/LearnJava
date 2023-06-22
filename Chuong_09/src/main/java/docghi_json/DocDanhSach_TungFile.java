/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghi_json;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author AN515-45
 */
public class DocDanhSach_TungFile {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<HocSinh> ds = new ArrayList<>();
        
        // khoi tao folder chua danh sach tap tin
        File folder = new File("json/danhsachf");
        File[] list_file = folder.listFiles();
        
        for(File f : list_file){
            if(f.isFile() && f.getName().endsWith(".json")){
                try {
                    FileReader file_ghi = new FileReader(f.getAbsoluteFile());
                    HocSinh hs = gson.fromJson(file_ghi, HocSinh.class);
                    ds.add(hs);
                    file_ghi.close();
                    System.out.println("Doc thanh cong");
                } catch (IOException ex) {
                    System.out.println("doc file that bai");
                }
            }
        }
        
        for(HocSinh hs : ds){
            System.out.println(hs);
        }
        
    }
    
}

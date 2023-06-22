/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghi_json;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class GhiDanhSach_Tungfile {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A001", "Tran Quang Nhat", 22));
        ds.add(new HocSinh("A002", "Ly Cong Uan", 20));
        ds.add(new HocSinh("A003", "Le Loi", 25));
        ds.add(new HocSinh("A004", "Vo Thi Sau", 19));
        
        try {
            for(HocSinh hs : ds ){
                FileWriter file_ghi = new FileWriter("json/danhsachf/" + hs.getMaHS() + ".json");
                gson.toJson(hs, file_ghi);
                file_ghi.close();
            }
            System.out.println("ghi thanh cong");
        } catch (Exception e) {
            System.out.println("ghi that bai");
        }
    }
    
}

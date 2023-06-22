/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghi_json;

import com.google.gson.Gson;
import java.io.FileWriter;

public class GhiDoiTuong01 {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A02", "Tran Quang Nhat", 21);
        try {
            Gson gson = new Gson();
            FileWriter file_ghi = new FileWriter("json/hs.json");
            gson.toJson(hs,file_ghi);
            file_ghi.close();
            System.out.println("Ghi doi tuong thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi tap tin that bai");
        }
    }
    
}

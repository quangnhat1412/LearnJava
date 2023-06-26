/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.json;

import com.google.gson.Gson;
import java.io.FileWriter;

/**
 *
 * @author AN515-45
 */
public class GhiDoiTuongJson {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A01", "Tran Quang Nhat", 21);
        Gson gson = new Gson();
        try {
            FileWriter file_ghi = new FileWriter("data3/json/hs_le.json");
            gson.toJson(hs,file_ghi);
            file_ghi.close();
            System.out.println("Ghi doi tuong thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi doi tuong that bai");
            e.printStackTrace();
        }
    }
}

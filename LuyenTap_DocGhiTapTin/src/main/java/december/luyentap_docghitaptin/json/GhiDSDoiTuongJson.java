/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.json;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.ArrayList;


/**
 *
 * @author AN515-45
 */
public class GhiDSDoiTuongJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A001", "Tran Quang Nhat", 22));
        ds.add(new HocSinh("A002", "Ly Cong Uan", 20));
        ds.add(new HocSinh("A003", "Le Loi", 25));
        ds.add(new HocSinh("A004", "Vo Thi Sau", 19));
        
        try {
            FileWriter file_ghi = new FileWriter("data3/json/dshs.json");
            gson.toJson(ds,file_ghi);
            file_ghi.close();
            System.out.println("Thanh Cong");
        } catch (Exception e) {
            System.out.println("That Bai"); 
        }
    }
}

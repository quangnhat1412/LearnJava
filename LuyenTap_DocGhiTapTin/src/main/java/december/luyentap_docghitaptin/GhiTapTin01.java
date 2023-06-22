/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class GhiTapTin01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tao 1 danh sach hoc sinh de luu vao tap tin
        ArrayList<HocSinh> dshocsinh = new ArrayList<>();
        dshocsinh.add(new HocSinh ("B001", "Tran Quang Nhat", 22));
        dshocsinh.add(new HocSinh ("B002", "Truong Cong Dinh", 20)); 
        dshocsinh.add(new HocSinh ("B003", "Le Loi", 19));      
        dshocsinh.add(new HocSinh ("B004", "Vo Thi Sau", 32));      
        dshocsinh.add(new HocSinh ("B005", "Nguyen Tat Thanh", 18)); 
        
        // Tien hanh ghi danh sach vao tap tin
        // 1. tao duong dan de luu tap tin 
        String path = "data/dshocsinh1.txt";
        try {
            FileWriter file = new FileWriter(path);
            BufferedWriter ghiFile = new BufferedWriter(file);
            for (HocSinh hs:dshocsinh){
                String chuoiHS = hs.getMaHS() + ":" + hs.getTenHS()+ ":" + hs.getTuoi();
                ghiFile.write(chuoiHS);
                ghiFile.newLine();
            }
            ghiFile.close();
        } catch (IOException ex) {
            System.out.println("Ghi tap tin that bai");
        }
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AN515-45
 */
public class GhiTapTin02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh ("B001", "Tran Quang Nhat", 22));
        ds.add(new HocSinh ("B002", "Truong Cong Dinh", 20)); 
        ds.add(new HocSinh ("B003", "Le Loi", 19));      
        ds.add(new HocSinh ("B004", "Vo Thi Sau", 32));      
        ds.add(new HocSinh ("B005", "Nguyen Tat Thanh", 18));      
        
        String path = "data/dshs1.txt";
        try {
            FileWriter file = new FileWriter(path);
            BufferedWriter ghiFile = new BufferedWriter(file);
            for (HocSinh hs:ds){
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

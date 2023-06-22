/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author AN515-45
 */
public class GhiDSDT_TungFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A001", "Tran Quang Nhat", 22));
        ds.add(new HocSinh("A002", "Ly Cong Uan", 20));
        ds.add(new HocSinh("A003", "Le Loi", 25));
        ds.add(new HocSinh("A004", "Vo Thi Sau", 19));
        
        for(HocSinh hs : ds){
            try {
                FileOutputStream fileOut = new FileOutputStream("Object/danhsachf/" + hs.getMaHS() + ".dat");
                ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
                objOut.writeObject(hs);
                objOut.close();
                fileOut.close();
                System.out.println("Ghi thanh cong");
            } catch (IOException ex) {
                System.out.println("Ghi that bai");
                ex.printStackTrace();
            }
        }
    }
    
}

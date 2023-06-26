/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author AN515-45
 */
public class GhiDoiTuongDat {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A001", "Tran Quang Nhat", 21);
        try {
            FileOutputStream file_ghi = new FileOutputStream("data3/object/hs_le.dat");
            ObjectOutputStream obj = new ObjectOutputStream(file_ghi);
            obj.writeObject(hs);
            obj.close();
            file_ghi.close();
            
            System.out.println("thanh cong");
        } catch (Exception e) {
            System.out.println("That bai");
        }
    }
}

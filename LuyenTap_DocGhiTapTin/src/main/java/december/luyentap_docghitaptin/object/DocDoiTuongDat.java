/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author AN515-45
 */
public class DocDoiTuongDat {
    public static void main(String[] args) {
        try {
            FileInputStream file_doc = new FileInputStream("data3/object/hs_le.dat");
            ObjectInputStream obj_in = new ObjectInputStream(file_doc);
            HocSinh hs = (HocSinh)obj_in.readObject();
            obj_in.close();
            file_doc.close();
            System.out.println("thanh cong ");
            System.out.println(hs);
        } catch (Exception e) {
            System.out.println("that bai");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiObject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author AN515-45
 */
public class GhiObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A001", "Tran Quang Nhat", 22);
        try {
            FileOutputStream fileOut = new FileOutputStream("Object/hs.dat");
            ObjectOutputStream obj = new ObjectOutputStream(fileOut);
            obj.writeObject(hs);
            obj.close();
            fileOut.close();
            System.out.println("Ghi doi tuong Object thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi doi tuong Object that bai");
        }
    }
    
}

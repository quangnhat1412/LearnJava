/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiObject;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author AN515-45
 */
public class DocObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("Object/hs.dat");
            ObjectInputStream obj = new ObjectInputStream(fileIn);
            
            HocSinh hs = (HocSinh)obj.readObject();
            System.out.println(hs);
            fileIn.close();
            System.out.println("Doc thanh cong");
        } catch (Exception e) {
            System.out.println("Doc that bai");
        }
    }
    
}

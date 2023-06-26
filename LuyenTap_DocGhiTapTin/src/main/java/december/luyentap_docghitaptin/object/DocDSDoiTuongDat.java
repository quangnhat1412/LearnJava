/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DocDSDoiTuongDat {
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        try {
            FileInputStream file_in = new FileInputStream("data3/object/dshs.dat");
            ObjectInputStream obj_in = new ObjectInputStream(file_in);
            ds = (ArrayList<HocSinh>)obj_in.readObject();
            obj_in.close();
            file_in.close();
            System.out.println("thanh cong");
        } catch (Exception e) {
            System.out.println("that bai");
        }
        for(HocSinh hs : ds){
            System.out.println(hs);
        }
    }
}

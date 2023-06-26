/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class GhiDSDoiTuongDat {
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A001", "Tran Quang Nhat", 22));
        ds.add(new HocSinh("A002", "Ly Cong Uan", 20));
        ds.add(new HocSinh("A003", "Le Loi", 25));
        ds.add(new HocSinh("A004", "Vo Thi Sau", 19));
        
        try {
            FileOutputStream file_out = new FileOutputStream("data3/object/dshs.dat");
            ObjectOutputStream obj_out = new ObjectOutputStream(file_out);
            obj_out.writeObject(ds);
            file_out.close();
            obj_out.close();
            
            System.out.println("thanh cong");
        } catch (Exception e) {
            System.out.println("That bai");
        }
    }
}

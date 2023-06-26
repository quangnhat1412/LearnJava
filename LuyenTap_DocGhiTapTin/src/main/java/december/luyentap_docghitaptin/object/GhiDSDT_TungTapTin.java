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
public class GhiDSDT_TungTapTin {
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A001", "Tran Quang Nhat", 22));
        ds.add(new HocSinh("A002", "Ly Cong Uan", 20));
        ds.add(new HocSinh("A003", "Le Loi", 25));
        ds.add(new HocSinh("A004", "Vo Thi Sau", 19));
        
        for(HocSinh hs : ds){
            // ung voi moi hoc sinh se tao ra 1 file mahs.dat
            try {
                FileOutputStream file_out = new FileOutputStream("data3/object/dsfile/" + hs.getMaHS() + ".dat");
                ObjectOutputStream obj_out = new ObjectOutputStream(file_out);
                obj_out.writeObject(hs);
                file_out.close();
                obj_out.close();
                System.out.println("Thanh cong");
            } catch (Exception e) {
                System.out.println("That bai");
            }
        }
    }
}

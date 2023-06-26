/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/**
 *
 * @author AN515-45
 */
public class DocDSDT_TrenTungTapTin {
    public static void main(String[] args) throws ClassNotFoundException {
        ArrayList<HocSinh> ds = new ArrayList<>();
        File folder = new File("data3/object/dsfile");
        File[] list_f = folder.listFiles();
        if(list_f != null){
            for(File f : list_f){
                if(f.isFile() && f.getName().endsWith(".dat")){
                    try {
                        FileInputStream file_in = new FileInputStream(f.getAbsoluteFile());
                        ObjectInputStream obj_in = new ObjectInputStream(file_in);
                        
                        HocSinh hs = (HocSinh)obj_in.readObject();
                        ds.add(hs);
                        file_in.close();
                        obj_in.close();
                    } catch (IOException ex) {
                        System.out.println("that bai");
                    }
                }
            }
            System.out.println("Thanh cong");
        }
        for(HocSinh hs : ds){
            System.out.println(hs);
        }
    }
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DocDSDL_TungFile {

    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        
        // Khoi tao folder chua danh sach cac file
        File folder = new File("Object/danhsachf");
        File[] l_file = folder.listFiles();
        
        for(File f : l_file){
            if(f.isFile() && f.getName().endsWith(".dat")){
                try {
                    FileInputStream fileIn = new FileInputStream(f.getAbsoluteFile());
                    ObjectInputStream obj_in = new ObjectInputStream(fileIn);
                    HocSinh hs = (HocSinh)obj_in.readObject();
                    ds.add(hs);
                    obj_in.close();
                    fileIn.close();
                    System.out.println("doc thanh cong");
                } catch (Exception e) {
                    System.out.println("doc that bai");
                }
            }
        }
        for(HocSinh hs : ds){
            System.out.println(hs);
        }
    }
    
}

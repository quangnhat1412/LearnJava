/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AN515-45
 */
public class Ghi01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> mangDong = new ArrayList<>();
        
        String cau1 = "Truc xinh truc moc dau dinh";
        String cau2 = "Em xinh em dung 1 minh cung xinh";
        mangDong.add(cau1);
        mangDong.add(cau2);
        
        // ghi du lieu tu mang vao tap tin
        String path = "data/baitho1.txt";
        try {
            FileWriter ghi_file = new FileWriter(path);
            BufferedWriter ghi = new BufferedWriter(ghi_file);
            for (String d : mangDong){
                ghi.write(d);
                ghi.newLine();
            }
            ghi.close();
        } catch (IOException ex) {
            System.out.println("Ghi tap tin that bai");
            
        }
        
        
    }
    
}

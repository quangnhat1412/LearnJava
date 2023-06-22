/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AN515-45
 */
public class DocTapTin_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khoi tao ArrayList de chua danh sach hoc sinh 
        ArrayList<HocSinh> list_HS = new ArrayList<>();
        
        // Tao duong dan tap tin 
        String path = "data/dshocsinh.txt";
        
        try {
            // Tien hanh doc tap tin
            FileReader file = new FileReader(path); // Tim tap tin thong qua duong dan
            BufferedReader docFile = new BufferedReader(file); // doc tap tin da tim dc
            String dong;
            while((dong = docFile.readLine()) != null) // doc tung dong trong tap tin da doc dc vao String dong; Neu dong null thi ngung doc
            {   
                String[] mangTach =  dong.trim().split(";");
                if(dong.isEmpty()) continue;
                HocSinh hs = new HocSinh(mangTach[0], mangTach[1], Integer.parseInt(mangTach[2])); // Ep kieu mangTach[2] thanh kieu int
                list_HS.add(hs);
            }
            docFile.close();
            for (HocSinh hs : list_HS){
                System.out.println(hs);
            }
        } catch (IOException ex) {
            System.out.println("Doc tap tin that bai, hay kiem tra lai code !!!");
            ex.printStackTrace();
        }
        
        
    }
    
}

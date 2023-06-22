/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DocTapTin01 {
    public static void main(String[] args) {
        ArrayList<String> mangDong = new ArrayList<>();
        String path = "data/baitho.txt";
        
        try {
            FileReader file = new FileReader(path);
            BufferedReader docFile = new BufferedReader (file);
            String dong;
            while((dong = docFile.readLine()) != null){
                mangDong.add(dong);
            }
            for (String d : mangDong){
                System.out.println(d);
            }
            
            docFile.close();
            
        } catch (IOException ex) {
            System.out.println("Doc tap tin that bai");
            ex.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DocGhiFile {
    public static ArrayList<String> docFile(String path){
        ArrayList<String> kq = new ArrayList<>();
        try {
            FileReader file = new FileReader(path,StandardCharsets.UTF_8);
            BufferedReader doc_file = new BufferedReader(file);
            String dong = "";
            while((dong = doc_file.readLine()) != null){
                if(dong.isEmpty()) continue;
                kq.add(dong);
            }
            doc_file.close();
            file.close();
        } catch (Exception e) {
            System.out.println("Doc tap tin that bai");
        }
        return kq;
    }
    
    public static void ghiFile(ArrayList<SinhVien> svList, String path){
        try {
            FileWriter fw = new FileWriter(path,StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(fw);
            for(SinhVien sv : svList){
                bw.write(String.format("%s;%s;%s",sv.getMaSV(),sv.getHoTenSV(),sv.getHocBong()));
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Ghi tap tin that bai");
        }
    }
}

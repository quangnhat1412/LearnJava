/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docdoituong;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XuLyDocDoiTuong4 {

    public static void main(String[] args) {
        ArrayList<HocSinh> hocsinhs = new ArrayList<>();
        try {
            // Khai bao folder chua cac tap tin xml can doc
            File folder = new File("data/ghidoituong/DSHS");
            // khai bao danh sanh cac tap tin lay dc trong folder
            File[] listfile = folder.listFiles();
            for (File f : listfile) {
                if (f.isFile() && f.getName().endsWith(".xml")) {
                    // Tao 2 doi tuong sau de phan tich, xu ly dc tai lieu xml
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    // tao doi tuong document tu tap tin
                    Document doccument = builder.parse(f.getAbsoluteFile());
                    Element hocsinh = doccument.getDocumentElement();
                    String mahs = hocsinh.getAttribute("mahs");
                    String tenhs = hocsinh.getAttribute("tenhs");
                    int t = Integer.parseInt(hocsinh.getAttribute("tuoi"));
                    HocSinh hs = new HocSinh(mahs, tenhs, t);
                    hocsinhs.add(hs);
                }
            }
            for (HocSinh hs : hocsinhs) {
                System.out.println(hs);
            }

        } catch (Exception e) {
            System.out.println("Doc tap tin that bai !!!");
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docdoituong;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XuLyDocDoiTuong2 {

    public static void main(String[] args) {
        try {
            // Tao 2 doi tuong sau de phan tich, xu ly dc tai lieu xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong document tu tap tin
            Document doccument = builder.parse(new File("data/ghidoituong/hocsinh2.xml"));
            Element hocsinh = doccument.getDocumentElement(); 
            
            String mahs = hocsinh.getAttribute("mahs");
            String tenhs = hocsinh.getAttribute("tenhs"); // lấy thuộc tính của thẻ 
            int t = Integer.parseInt(hocsinh.getAttribute("tuoi"));
            HocSinh hs = new HocSinh(mahs, tenhs, t);
            System.out.println(hs);
        } catch (Exception e) {
            System.out.println("Doc tap tin that bai !!!");
        }
    }
    
}
